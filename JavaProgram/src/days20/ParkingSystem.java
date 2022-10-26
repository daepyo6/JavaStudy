package days20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class Car implements Serializable {
	private static final long serialVersionUID = -2250692798109451124L;
	
	private String carNumber;			// 차번호
	private String enterDateTime;	// 주차장에 들어온 시간
	private Date enterDate;
	
	public String getCarNumber() { return carNumber; }
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	} 
	public String getEnterDateTime() { return enterDateTime; }
	public void setEnterDateTime(String enterDateTime) {
		this.enterDateTime = enterDateTime;
	}

	public Car() { }
	
	public Car(String carNumber) {
		this.carNumber = carNumber;	// 전달된 차량번호 저장
		enterDate = new Date();			// 오늘 날짜 생성 & 멤버 변수에 저장
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd_HH:mm");
		this.enterDateTime = sdf.format(enterDate) + "";	// 날짜 시간을 String으로 변환해서 저장
	}
	
	@Override
	public String toString() {
		return this.carNumber + "#" + this.enterDateTime;
		// 12가1234#2022-10-26_09:57리턴
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Car))
			return false;
		Car target = (Car) obj;
		return this.carNumber.equals(target.carNumber);
	}
	public int payCount() throws ParseException {
		int pay = 0;
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd_HH:mm");
		// 입차시간을 Date로 변환 -> 밀리초로 환산
		Date enterD = sdf.parse(this.enterDateTime);	// String -> Date
		Calendar enterTime = Calendar.getInstance();
		enterTime.setTime(enterD);								// Date -> Calendar
		long enterMilli = enterTime.getTimeInMillis();		// Calendar -> Millisecond
		// now 변수도 밀리초로 환산
		Calendar nowTime = Calendar.getInstance();
		nowTime.setTime(now);									// Date -> Calendar
		long nowMilli = nowTime.getTimeInMillis();		// Calendar -> Millisecond
		// now - 입차시간
		long res = (nowMilli - enterMilli)/1000;
		// 그 결과를 (시간:분)으로 환산
		int minuteTime = (int)( res / 60 % 60 );
		int hourTime = (int)( res / 60 / 60 );
		
		// 주차비 1시간 당 2000원, 10분 당 400원으로 계산
		System.out.println(enterMilli +" "+ nowMilli+" "+ res +" "+ hourTime +" "+ minuteTime);
		pay = (hourTime*2000) + (minuteTime*400);
		return pay;
	}
	
}

public class ParkingSystem {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, ParseException {
		Scanner sc = new Scanner(System.in);
		
		String dirName = "D:\\JAVA01\\Java_se\\parking";
		
		File dir = new File(dirName);
		if(!dir.exists())	dir.mkdirs();
		File file = new File(dir, "parking.dat");

		ArrayList<Car> list;	//입차하는 차들이 저장될 리스트
		
		// 파일 유무를 점검해서 파일이 있으면 읽어와서 list에 저장
		// 파일이 없으면 최초 실행이므로 새 ArrayList list를 생성
		if (file.exists()) {
			ObjectInputStream ois = 
					new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
			list = (ArrayList<Car>) ois.readObject();
			ois.close();
		}else{
			list = new ArrayList<>();
		}
		while(true) {
			System.out.print("1.입차\t2.출차\t3.주차상황\t4.종료\t");
			System.out.print("입력 : ");
			int input = Integer.parseInt(sc.nextLine());
			if(input==4) break;	// 4번 입력시 while문 종료. 리스트를 파일에 저장 후 프로그램도 종료
			
			switch (input) {
			case 1:
				enterCar(list);
				break;
			case 2:
				outCar(list);
				break;
			case 3:
				viewList(list);
			case 5:
				for (int i = 0; i < list.size(); i++) 
					list.get(i).setEnterDateTime("22-10-25_23:30");
			}
		}
		System.out.println("프로그램을 종료합니다.");
		ObjectOutputStream oos = 
				new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
		oos.writeObject(list);	// 주차중인 차를 담고 있는 리스트를 파일에 저장
		oos.close();
	}
	
	private static void enterCar(ArrayList<Car> list) {
	      // 차량번호를 입력받고, 객체를 생성해서, list에 저장
	      // 주차 중인 차량의 댓수가 10이면 "만차입니다"라고 출력 및 종료
	      if( list.size()==10 ) {
	         System.out.println("만차입니다. 더 이상 주차할 수 없습니다.");
	         return;
	      }
	      // 차량번호 입력
	      Scanner sc = new Scanner(System.in);
	      System.out.print("입차 : 차량번호를 입력 -> ");
	      String num = sc.nextLine();
	      // Car 객체 생성 : 차량번호를 전달인수로 전달하는 생성자 호출
	      Car c = new Car(num);
	      list.add(c); // 리스트에 차량 추가
	}
	
	private static void outCar(ArrayList<Car> list) throws ParseException {
		// 나갈 차량번호 입력
		Scanner sc = new Scanner(System.in);
	    System.out.print("출차 : 차량번호 네자리를 입력 -> ");
	    String num = sc.nextLine();
	    
	    // 입력받은 차번호로 주차된 차량의 차번호 4자리를 비교해서같은 차량이 있으면 모두 출력후 선택하게 합니다.
	    
	    // 뒷자리 4자리가 같은 차량을 담을 배열을 따로 생성합니다.
	    Car [] cars = new Car[10];
	    
	    for (int i = 0; i < list.size(); i++) {
	    	// 입력한 차번호와 리스트에 있는 차량의 번호가 같다면
	    	if( list.get(i).getCarNumber().contains(num) ) 
	    		cars[i] = list.get(i); // 현재 차량의 저장된 리스트 주소값을 cars 배열의 같은 위치에 저장
		}
	    
	    if(cars.length == 0) {
	    	System.out.println("찾는 차량이 없습니다.");
	    	return;
	    }
	    
	    for (int i = 0; i < cars.length; i++) {
			if(cars[i]!=null)		// cars 배열값들 중 null이 아닌 것들만 화면에 번호와 함께 출력
				System.out.println((i+1) + ". " + cars[i].toString());
		}
	    
	    // 출력된 리스트에서 출차할 차량의 순번 입력
	    int k = sc.nextInt();
	    
	    // 요금 계산
	    int pay = cars[k-1].payCount();
	    // 요금 출력
	    System.out.println("주차 요금은 " + pay + "원 입니다.");
	    // 출차
	    list.remove(k-1);
	}

	private static void viewList(ArrayList<Car> list) {
		// 한줄에 한대의 차량을 출력. 차량이 없으면 "주차중인 차량이 없습니다" 출력
		System.out.println("주차중인 차량 목록 =============");
		if(list.isEmpty())
			System.out.println("주차중인 차량이 없습니다");
		else {
			for (Car c : list) {
				System.out.println(c);
			} System.out.println();
		}
		
		
		
	}

}










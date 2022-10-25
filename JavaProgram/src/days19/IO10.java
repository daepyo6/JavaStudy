package days19;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO10 {

	public static void main(String[] args) throws IOException {
		// 1. 선거에 있어서 최고득표자가 2인 이상인 떄에는 국회의 재적의원 과반수가
		// 출석한 공개회의에서 다수표를 얻은자를 당선자로 한다.
		// 이 헌법 시행당시 법령과 조약은 이 헌법에 위배되지 아니하는한 그 효력을 지속한다.
		
		// 국회의 회의는 공개된다. 다만, 출석의원 50%이상의 찬성이 있거나
		// 의장이 국가의 안전보장을 위하여 필요하다고 인정할 때에는 공개하지 아니할 수 있다.
		
		// abc.txt에 위에 텍스트를 써넣으세요
		// 문단 간격 유지해서 출력
		
		String dirName = "D:\\JAVA01\\Java_se\\temp";
		String data = "1. 선거에 있어서 \"최고득표자\"가 2인 이상인 떄에는 국회의 재적의원 과반수가 "
				+ "출석한 공개회의에서 다수표를 얻은자를 \"당선자\"로 한다.\n"
				+ "이 헌법 시행당시 법령과 조약은 이 헌법에 위배되지 아니하는한 그 효력을 지속한다.\n\n"
				+ "2. 국회의 회의는 공개된다. 다만, 출석의원 50%이상의 찬성이 있거나 "
				+ "의장이 국가의 안전보장을 위하여 필요하다고 인정할 때에는 공개하지 아니할 수 있다.";
		
		File dir = new File(dirName);
		if(!dir.exists())
			dir.mkdirs();
		File fileText = new File(dir, "abc.txt");
		FileWriter fwText = new FileWriter(fileText);
		
		fwText.write(data);
		fwText.close();
		
		FileReader fisText = new FileReader(fileText);
		int dataText;
		dataText = fisText.read();
		while(dataText != -1) {
			System.out.print((char)dataText);
			dataText = fisText.read();
		}
		
		fisText.close();
		
	}

}

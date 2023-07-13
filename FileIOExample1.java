import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOExample1 {

	public static void main(String[] args) throws IOException {
		File fd= new File("VIkFolder");
////		
//		System.out.println(fd.isDirectory());
//		fd.mkdir();
//		
		File f= new File(fd,"Vik.txt");
		
//		System.out.println(f.isFile());
//		f.createNewFile();
//		
//		FileWriter FW = new FileWriter(f,true);
//		FW.write(66);
//		FW.write("\n");
//		FW.write("Vikram Java Program");
//		FW.write("\n");
//		char ch[]= {'h','y','s','t','u','d','e','n','t'};
//		FW.write(ch);
//		FW.close();
		
	FileReader FD = new FileReader(f);
	char ch []= new char[(int)f.length()];
		FD.read(ch);
		
		for(char data : ch) {
			System.out.print(data);
		}
		
		

	}

}

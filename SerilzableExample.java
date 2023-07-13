
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class DetailsStudent1 implements Serializable   {

	private String name;
	private int age;
	private int rollnumber;
	private String result;
	
	
	
	public DetailsStudent1(String name, int age, int rollnumber, String result) {
		
		this.name = name;
		this.age = age;
		this.rollnumber = rollnumber;
		this.result = result;
	}

public void Disp() {
	System.out.println(name);
	System.out.println(age);
	System.out.println(rollnumber);
	System.out.println(result);
	
}

	
}



public class SerilzableExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		DetailsStudent1  DS = new DetailsStudent1("Tilak",25,133,"PASS");
		
//		
//		FileOutputStream FIS = new FileOutputStream("Vik.txt");
//		BufferedOutputStream BOS = new BufferedOutputStream(FIS);
//	ObjectOutputStream OOS = new ObjectOutputStream(BOS);
//	
//         OOS.writeObject(DS);
//         OOS.flush();
//         OOS.close();

		FileInputStream FIS = new FileInputStream("Vik.txt");
		BufferedInputStream BIS = new BufferedInputStream(FIS);
		ObjectInputStream OIS = new ObjectInputStream(BIS);
		
		DetailsStudent1 DS1=(DetailsStudent1)OIS.readObject();
	DS1.Disp();
       OIS.close();
		
		
	}

}

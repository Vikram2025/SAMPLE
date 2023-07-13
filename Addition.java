import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
	int a,b;
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the value of a");
	a= scan.nextInt();
	System.out.println("enter the value of b");
	b= scan.nextInt();
	
	int c = a+b;
	System.out.println(c);

	}

}

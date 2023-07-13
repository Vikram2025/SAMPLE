package PreparationExample;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students{
	private String name;
	private int age;
	private int rollnumber;
	private String result;
	
	
	
	public Students(String name, int age, int rollnumber, String result) {
		
		this.name = name;
		this.age = age;
		this.rollnumber = rollnumber;
		this.result = result;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getRollnumber() {
		return rollnumber;
	}
	
	public String getResult() {
		return result;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", age=" + age + ", rollnumber=" + rollnumber + ", result=" + result + "]";
	}
	
	
	
	
	
}

class Mysorting implements Comparator<Students>{

	public int compare(Students ST3, Students ST4) {
		if(ST3.getAge()<ST4.getAge()) 
			return 1;
		
			else
			return -1;
		
	}
	
}





public class DetailsStudent {

	public static void main(String[] args) {
	Students ST = new Students("Vikram",24,123,"Pass");
	Students ST1 = new Students("Chirag",22,123,"Pass");
	Students ST2 = new Students("Tilak",25,123,"Pass");

	List<Students> list = new ArrayList();
	
//	Collections.sort(list);
	list.add(ST);
	list.add(ST1);
	list.add(ST2);
	
	System.out.println("before sorting");
	System.out.println(list);
	
        Mysorting SO = new Mysorting();
        
    Collections.sort(list, SO);
    System.out.println("After sorting");
    System.out.println(list);
	
  	
	}

}

package PreparationExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 class DetailsStudent1 implements Comparable<DetailsStudent1> {
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

       public int compareTo(DetailsStudent1 a) {
    	   if(this.age>a.age) 
    		   return 1;
    	   else
    		   return-1;
       }
	
	
	
}
 public class ComparableExample {

	public static void main(String[] args) {
		DetailsStudent1 CS = new DetailsStudent1("Vikram",24,123,"Pass");
		DetailsStudent1 CS1 = new DetailsStudent1("Chirag",22,123,"Pass");
		DetailsStudent1 CS2 = new DetailsStudent1("Tilak",25,123,"Pass");

	List<DetailsStudent1> list = new ArrayList();
	
//	Collections.sort(list);
list.add(CS2);
list.add(CS);
list.add(CS1);


	System.out.println("before sorting");
	System.out.println(list);
	
       Collections.sort(list);
   	System.out.println("After sorting");
   	System.out.println(list);
   	
	}

}
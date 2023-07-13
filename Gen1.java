class Gen2<V>{
	V var;
	public Gen2(V var) {
		this.var =var;
		
	}
	
	void disp() {
		System.out.println(var.getClass().getName());
	}
	
	public V getvar(){
		return var;
	}
}
public class Gen1 {

	public static void main(String[] args) {
    Gen2<String> g= new Gen2<String>("vikram");
     g.disp();
    System.out.println(g.getvar()); 
	}

}

class Mystatic{
    // Static variable
    static int staticVariable = 10;

    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method");
    }

    // Instance method
    public void instanceMethod() {
        System.out.println("This is an instance method");
    }
}



public class MyClass {

    public static void main(String[] args) {
        // Accessing a static variable

//
        // Calling a static method
        Mystatic.staticMethod();
//
//        // Creating an instance of the class
//        MyClass myObject = new MyClass();
//
//        // Accessing an instance method
//        myObject.instanceMethod();
        
        
    }
}



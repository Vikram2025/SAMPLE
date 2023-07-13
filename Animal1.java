public class Animal1 {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

 class Dog2 extends Animal1 {
    @Override
    public void eat() {
        super.eat(); // Invoke the eat() method of the superclass
        System.out.println("Dog is eating.");
    }
}
class Animal{
    void sound(){
    System.out.println("Animal makes sound");
}
}
class Dog extends Animal {
    @Override 
    void sound(){
        System.out.println("DOG BARKS");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}

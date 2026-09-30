class Phone{
    String name = "iphone";
    void call(){
        System.out.println("Calling...");
    }
}
class Smartphone extends Phone {
    void browse() {
        System.out.println("Browsing...");
    }
}
public class Main {
    public static void main(String[] args){
        Smartphone sp = new Smartphone();
        System.out.println(sp.name);
        sp.call();
        sp.browse();
    } 
}
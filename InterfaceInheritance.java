interface Student{
    void study();
}
class Irfan implements Student{
    public void study(){
        System.out.println("studing ");
    }
    
}
public class InterfaceInheritance{
    public static void main(String[] args) {
        Irfan i = new Irfan();
        i.study();
    }
} 
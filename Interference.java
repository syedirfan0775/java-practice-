interface camera{
    void takePhoto();
}
interface music{
    void listenMusic();
}
class SmartPhone implements camera,music{
    public void takePhoto(){
        System.out.println("PHOTO CAPTURED");
    } 
    public void listenMusic(){
        System.out.println("MUSIC LISTENING");
    }
    public static void main(String[] args){
        SmartPhone s = new SmartPhone();
        s.listenMusic();
        s.takePhoto();
    }
}
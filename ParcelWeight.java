import java.util.*;
public class ParcelWeight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter parcel weight:");
            
            double weight = Double.parseDouble(sc.nextLine());
            
            if (weight > 0 && weight<=50){
            System.out.println("Weight accepted:" + weight + "kg");}
            else if (weight<0){
                System.out.println("Enter Pos");
            }else{
                System.out.println("Enter less than 50");
            }
}
    catch(NumberFormatException e){
        System.out.println("Invalid weight " + "Please Enter the number");
    }
    finally{
        System.out.println("Weight checking completed");
    }
    sc.close();
} 
    } 
  
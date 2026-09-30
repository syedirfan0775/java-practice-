import java.util.Scanner;
public class Extremes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of students:"); 
        int[] marks = new int[sc.nextInt()];
        System.out.print("Enter marks of students:"+ marks.length);

        for (int i=0 ; i<marks.length; i++){
            marks[i] = sc.nextInt(); 
        } 
        int highest = marks[0];
        int lowest = marks[0]; 
        for(int i=1; i<marks.length;i++){
            if(marks[i] > highest){
                highest = marks[i]; 
            }
            if(marks[i] < lowest){
                lowest = marks[i];
            }
        }
        System.out.println(highest);
        System.out.println(lowest);



    }
}

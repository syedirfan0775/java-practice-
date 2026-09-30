import java.util.Scanner;
public class Q1studentmarks{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of Students:");
        int n = sc.nextInt();
        int[] marks = new int[n];
        
        System.out.println("Enter marks of "+ marks.length +" Students:");
        for(int i=0; i<marks.length;i++){
            marks[i] = sc.nextInt();
        }
        int total = 0;
        for (int i = 0; i<marks.length;i++){
            total += marks[i]; 
        }
        double average = total/marks.length;  
        System.out.println("Total marks of students = " + total);
        System.out.println("Average marks of students = " + average);
    }
}

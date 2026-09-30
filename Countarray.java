public class Countarray {
    public static void main(String[] args){
        int count = 0;
        int passmarks = 40;
        int[] marks = { 40 , 20 , 30 ,57 ,80};
        for(int i=0; i<marks.length;i++){
            if(marks[i] >= passmarks){
                count ++;
            }
        }
        System.out.println("Total no of students passed:"+count);
    }
}

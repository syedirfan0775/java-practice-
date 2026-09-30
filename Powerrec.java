public class Powerrec {
    static int power(int x,int n){
        if (n==0){
            return 1;
        }
        if (x==0){ 
            return 0;
        }
        return x*power(x,n-1);
        }
        public static void main(String[] args){
            System.out.println("Power of 2,3 = " + power(2,3));
        }
    }



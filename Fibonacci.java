// Fibonacci series
import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int f1,f2,n,temp;
        f1=0;
        f2=1;
        System.out.println("Enter the number for how many times Fibonacci series you want?");
        n = sc.nextInt();
        System.out.print(f1+" "+f2);
        for(int i=0; i<n-2; i++){
            temp = f1+f2;
            System.out.print(" "+temp);
            f1 = f2;
            f2 = temp;
        }
    }
    
}

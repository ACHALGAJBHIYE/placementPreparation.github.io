/**
 * ReverseNumber
 */
import java.util.Scanner;
public class ReverseNumber {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number=");
        int n=sc.nextInt();
        int temp,rem,reverse;
        temp=n;
        reverse=0;
        rem=0;
        while(temp>0){
            rem=temp%10;
            reverse=reverse*10+rem;
            temp=temp/10;
        }
        System.out.println("Reverse of a number ="+reverse);

    }
}
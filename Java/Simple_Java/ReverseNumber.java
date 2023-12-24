package Simple_Java;

import java.util.Scanner;

public class ReverseNumber {

    public static void main (String [] args) {

        int num,rem,rev=0,temp ;

        System.out.print("Enter the number to reverse : ");
        Scanner sc  = new Scanner(System.in);

        num = sc.nextInt();
        temp = num ;
        while(num>0){
            rem = num%10;
            rev = (rev*10)+rem;
            num = num/10;
        }
        System.out.println("Reverse Number is : "+rev);
    }
}

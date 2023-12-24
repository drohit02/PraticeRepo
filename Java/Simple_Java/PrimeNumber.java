package Simple_Java;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args){

        int num;
        int flag = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = sc.nextInt();


        for (int i= 2; i<=num/2;i++){
            if(num%i==0){
                flag = 1;
                break;
            }
        }
        if (flag==0){
            System.out.println(num + " is a prime number");
        }
        else{
            System.out.println(num + " is not prime number");
        }


    }
}

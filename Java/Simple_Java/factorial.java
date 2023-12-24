package Simple_Java;

import java.util.Scanner;

public class factorial {

    public static void main(String [] args) {
        int num;
        long fact = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which factorial need to find : ");

        num = sc.nextInt();

        for(int i=1;i<=num;i++){
            fact = fact*i;
        }
        System.out.println("factorial is : "+fact);

    }
}

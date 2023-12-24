package Array_Java;

import java.util.Scanner;

public class ArrayCreate {

    public static void main(String [] args){
        int size ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        size = sc. nextInt();

        int arr[] = new int[size];
        for (int i = 0 ;i<size;i++){
            System.out.print("Enter the element at index : "+i+" ");

            arr[i] = sc.nextInt();
        }
        System.out.print("Array is : ");
        for (int i= 0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

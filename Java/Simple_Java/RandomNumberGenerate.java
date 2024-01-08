package com.Simple_Java;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random randNum = new Random();
        System.out.println(randNum.nextInt(35628));


    }
}

package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt(); int y = sc.nextInt();
            if(2 * x >= y)
                System.out.print("No");
            else
                System.out.print("Yes");
    }
}
package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int[] arr1 = {50,0,25,75,100};
        int[] arr2 = {50,100,75,25,0};
        int spot = 4;
        int A = arr1[spot];
        int An = A;
        int B = arr2[spot];
        int Bn = B;
        int C = 0;
        int Cn = C;
        double Pab = .6;
        double Pbc = .3;
        System.out.println("Round " + (spot+1));
        System.out.println("An = " + A + " Bn = " + B);

        for(int i = 0;i < 5; i++){
            System.out.println("A = " + An);
            //System.out.print("");
            An = (int) (A - Math.floor(Pab/100*A*B));
        }
        //scan.nextLine();
        System.out.println("");
        for(int i = 0;i < 5; i++){
            System.out.println("B = " + Bn);
            System.out.print("");
            Bn = (int) (B + Math.floor(Pab/100*A*B) - Math.floor(Pbc*B));
        }
//        for(int i = 0;i < 5; i++){
//            System.out.print("C = " + Cn);
//            Cn = (int) (C + Math.floor(Pbc*B));
//        }
    }
}

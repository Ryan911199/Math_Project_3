package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int[] arr1 = {50,0,25,75,100};
        int[] arr2 = {50,100,75,25,0};
        int spot = 4;
        int runs = 20;
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
        System.out.println(" ");
        int[] arrAn = new int[runs];
        int[] arrBn = new int[runs];
        int[] arrCn = new int[runs];

        for(int i = 0;i < runs; i++){
            arrAn[i] = An;
            An = (int) (An - Math.floor(Pab/100*An*Bn));
            arrBn[i] = Bn;
            Bn = (int) (Bn + Math.floor(Pab/100*An*Bn) - Math.floor(Pbc*Bn));
            arrCn[i] = Cn;
            Cn = (int) (Cn + Math.floor(Pbc*Bn));
        }
        for (int t = 0; t < runs; t++){
            System.out.print(t + " A = " + arrAn[t]);
            System.out.print("   " + t + " B = " + arrBn[t]);
            System.out.print("   " + t + " C = " + arrCn[t]);
            System.out.println("");
        }
        for (int t = 0; t < runs; t++){
            System.out.println(t + " A = " + arrAn[t]);
        }
        for (int t = 0; t < runs; t++){
            System.out.println(t + " B = " + arrBn[t]);
        }
        for (int t = 0; t < runs; t++){
            System.out.println(t + " C = " + arrCn[t]);
        }

        //scan.nextLine();
        //System.out.println("");
        //for(int i = 0;i < 5; i++){
        //    System.out.println("B = " + Bn);
        //    System.out.print("");
        //    Bn = (int) (B + Math.floor(Pab/100*A*B) - Math.floor(Pbc*B));
        //}
//        for(int i = 0;i < 5; i++){
//            System.out.print("C = " + Cn);
//            Cn = (int) (C + Math.floor(Pbc*Bn));
//        }
    }
}

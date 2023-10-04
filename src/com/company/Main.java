package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Lütfen Sayı Giriniz:");
        int number=input.nextInt();
        //Elmasın Baş Kısmı;
        for(int i=1; i<=number; i++) {
            for(int k=1; k<=(number-i); k++ ){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=number-1; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=(number-i)*2-1; k>0; k--){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}

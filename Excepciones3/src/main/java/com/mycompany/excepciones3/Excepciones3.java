package com.mycompany.excepciones3;

import java.util.Scanner;

public class Excepciones3 {

    public static void main(String[] args) {
        int x=10, y ,z;
        System.out.println("Ingrese y: ");
        try{
            y = new Scanner(System.in).nextInt();
            z=x/y;
            System.out.println("Resultado: " + z);
        }catch(Exception e){
            System.out.println("Ocurriormun error");
        }
        System.out.println("Adios");
    }
}

package com.mycompany.excepciones;

public class Excepciones {

    public static void main(String[] args) {
        
        try{
            int resultado = 3/0;
        }catch(Exception e){
            System.out.println("No se puede dividir  por cero");
        }
    }
}

package com.mycompany.excepciones2;

public class Excepciones2 {

    public static void main(String[] args) {
        int edades[] = {15,12,23,30};
        try{
        System.out.println("La edad de la posición 4 es: "+ edades[4]);
        } catch(Exception e){
            System.out.println("Intentaste acceder a un indice que no existe");
        }
    }
}

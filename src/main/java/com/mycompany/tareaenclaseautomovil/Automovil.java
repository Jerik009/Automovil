package com.mycompany.tareaenclaseautomovil;

public class Automovil {

    /*Atributos*/
    public String brand;
    public String model;
    public int engine;
    public int numberdoors;
    public int numbersseats;
    public int Maxispeed;
    public int currentspeed;

    /*Metodos*/
    public void acelerar() {
        System.out.println("Aceleraste");
    }

    public void Desacelerar() {
        System.out.println("Desceleraste");
    }

    public void frenar() {
        System.out.println("Frenaste");
    }

    public void tiempo() {
        System.out.println("El tiempo estimado de llegada es ");

    }
    
    public void show(){
        System.out.println("Marca: "+brand);
        System.out.println("modelo: "+model);
        System.out.println("Motor: "+engine);
        System.out.println("Puertas: "+numberdoors);
    }
}

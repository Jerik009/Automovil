package com.mycompany.tareaenclaseautomovil;

public class TareaEnClaseAutomovil {

    public static void main(String[] args) {
        
        Automovil car = new Automovil("Toyota", 2022, 7.16f, Fueltype.GASOLINE, CarType.CITY_CAR, 5, 5, 180, Color.YELLOW, 0.0f);
            
 
        car.setCurrentSpeed(100);
        System.out.println("Velocidad inicial es de 100 km/h.");
        
 
        car.acelerar(20);
        
 
        car.desacelerar(50);
       
 
        car.frenar();
        car.show();
    }
}

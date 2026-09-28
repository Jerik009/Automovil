package com.mycompany.tareaenclaseautomovil;

public class TareaEnClaseAutomovil {

    public static void main(String[] args) {
        
        Automovil car = new Automovil("Toyota", 2022, 7.16f, Fueltype.GASOLINE, CarType.CITY_CAR, 5, 5, 120, Color.YELLOW, 0.0f);
            
 
        car.setCurrentSpeed(0);
        System.out.println("Velocidad inicial es de 0 km/h.");
        
 
        car.acelerar(70);
        
 
        car.desacelerar(50);
       
 
        car.frenar();
        car.show();
    }
}

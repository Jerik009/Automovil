package com.mycompany.tareaenclaseautomovil;

public class TareaEnClaseAutomovil {

    public static void main(String[] args) {
        
        /*Automovil car = new Automovil("Toyota", 2022, 7.16f, Fueltype.GASOLINE, CarType.CITY_CAR, 5, 5, 180, Color.YELLOW, 0.0f);
            
 
        car.setCurrentSpeed(100);
        System.out.println("Velocidad inicial es de 100 km/h.");
        
 
        car.acelerar(20);
        
 
        car.desacelerar(50);
        car.tiempo(40);
 
        car.frenar();
        car.show();*/
        
        
        Automovil car = new Automovil();
        car.setBrand("Toyota");
        car.setModel(2022);
        car.setEngine(1.5f);
        car.setFueltype(Fueltype.GASOLINE);
        car.setCartype(CarType.CITY_CAR);
        car.setNumberdoors(5);
        car.setNumbersseats(5);
        car.setMaxspeed(180);
        car.setColor(Color.YELLOW);
        
        car.show();
        
    }
}

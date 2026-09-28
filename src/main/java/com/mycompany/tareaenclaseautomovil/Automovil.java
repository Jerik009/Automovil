package com.mycompany.tareaenclaseautomovil;

public class Automovil {

    /*Atributos*/
    public String brand;
    public int model;
    public float engine;
    public Fueltype fueltype;
    public CarType cartype;
    public int numberdoors;
    public int numbersseats;
    public float maxspeed;
    public Color color;
    public float currentspeed;

    public Automovil(String brand, int model, float engine, Fueltype fueltype, CarType cartype, int numberdoors, int numbersseats, float maxspeed, Color color, float currentspeed) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.fueltype = fueltype;
        this.cartype = cartype;
        this.numberdoors = numberdoors;
        this.numbersseats = numbersseats;
        this.maxspeed = maxspeed;
        this.color = color;
        this.currentspeed = currentspeed;
    }
    
    

    /*Metodos*/
    public void acelerar(float amount) {
        if (currentspeed + amount > maxspeed) {
            System.out.println("Error, aceleraste mas que la velocidad maxima que es: " + maxspeed+"km/h");
        } else {
            currentspeed+=amount;
            System.out.println("Aceleraste "+ amount + "km/h. Velocidad actual: "+ currentspeed + "km/h");
        }
   
    }

    public void desacelerar(float amount) {
        if (currentspeed - amount < 0) {
            System.out.println("Error, velocidad negativa");
        } else {
            currentspeed -= amount;
            System.out.println("Desaceleraste "+ amount + "km/h. Velocidad actual: "+ currentspeed + "km/h");
        }
   
    }

    public void frenar() {
        currentspeed = 0;
        System.out.println("Frenaste. Velocidad actual " + currentspeed + "km/h");
    }

    public double tiempo(float distance) {
        if (currentspeed == 0) {
            System.out.println("Error, no se puede calcular el tiempo con velocidad 0.");
            
        }
        return distance / currentspeed;

    }
    
    public void show() {
        System.out.println("---- Automobile Info ----");
        System.out.println("Brand: " + brand);
        System.out.println("Model (year): " + model);
        System.out.println("Engine: " + engine + " L");
        System.out.println("Fuel type: " + fueltype);
        System.out.println("Car type: " + cartype);
        System.out.println("Doors: " + numberdoors);
        System.out.println("Seats: " + numbersseats);
        System.out.println("Max speed: " + maxspeed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Current speed: " + currentspeed + " km/h");
    }
    public void setCurrentSpeed(float speed) {
        this.currentspeed = speed;
    }
}

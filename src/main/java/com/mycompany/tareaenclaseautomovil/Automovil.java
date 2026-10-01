package com.mycompany.tareaenclaseautomovil;

public class Automovil {
    
    //COnstructor
    
    
    
    public Automovil() {
        
    }

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
    

    /*Atributos*/
    private String brand;
    private int model;
    private float engine;
    private Fueltype fueltype;
    private CarType cartype;
    private int numberdoors;
    private int numbersseats;
    private float maxspeed;
    private Color color;
    private float currentspeed;
    
    //Setter Y Getter

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public float getEngine() {
        return engine;
    }

    public void setEngine(float engine) {
        this.engine = engine;
    }

    public Fueltype getFueltype() {
        return fueltype;
    }

    public void setFueltype(Fueltype fueltype) {
        this.fueltype = fueltype;
    }

    public CarType getCartype() {
        return cartype;
    }

    public void setCartype(CarType cartype) {
        this.cartype = cartype;
    }

    public int getNumberdoors() {
        return numberdoors;
    }

    public void setNumberdoors(int numberdoors) {
        this.numberdoors = numberdoors;
    }

    public int getNumbersseats() {
        return numbersseats;
    }

    public void setNumbersseats(int numbersseats) {
        this.numbersseats = numbersseats;
    }

    public float getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(float maxspeed) {
        this.maxspeed = maxspeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getCurrentspeed() {
        return currentspeed;
    }

    public void setCurrentspeed(float currentspeed) {
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
        return -1;
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
}

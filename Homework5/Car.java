package Homework5;

public class Car {

    private String model;
    private String brand;
    private int currentSpeed = 0;

    public Car(String model, String brand, int currentSpeed) {
        this.model = model;
        this.brand = brand;
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentSpeed(){
        return this.currentSpeed;
    }

    public int speedUp(int currentSpeed){
        this.currentSpeed = this.currentSpeed + currentSpeed;
        return this.currentSpeed;
    }

    public int Break(){
        if(this.currentSpeed <= 10){
            this.currentSpeed = 0;
        }else{
            this.currentSpeed = this.currentSpeed - 10;
        }
        return this.currentSpeed;
    }
}

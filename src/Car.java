public class Car {
    private String brand;
    private int maxSpeed;
    private int horsePower;
    private int torque;

   Car ()
    {/*
        brand = "any";
        maxSpeed = 1;
        horsePower = 1;
        torque = 1;
   */ }

    Car (String brand, int maxSpeed, int horsePower, int torque)
    {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.horsePower = horsePower;
        this.torque = torque;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getTorque() {
        return torque;
    }
}
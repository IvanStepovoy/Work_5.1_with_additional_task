public class BMW3 extends Car {

    public BMW3 (String brand, int maxSpeed, int horsePower, int torque)
    {
        setBrand(brand);
        setMaxSpeed(maxSpeed);
        setHorsePower(horsePower);
        setTorque(torque);
    }

    public void param ()
    {
        System.out.println("Model: "+getBrand());
        System.out.println("Max Speed: " + getMaxSpeed());
        System.out.println("Horse Power: "+ getHorsePower());
        System.out.println("Torque: " + getTorque());
    }
}

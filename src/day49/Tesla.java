package day49;

public class Tesla extends Vehicle implements Autonomous,Chargable {

 String model;
 int horsePower;

    public Tesla(int year, String model, int horsePower) {
        super(year);
        this.model=model;
        this.horsePower=horsePower;
    }

    @Override
    public void Charge(){
        System.out.println("Car is charging");
    }

    @Override
    public void start() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public String toString() {
        return "Tesla{" +
                "model='" + model + '\'' +
                ", horsePower=" + horsePower +
                ", year=" + year +
                '}';
    }
}

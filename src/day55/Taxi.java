package day55;

public class Taxi {

    int plateNumber;
    Engine en;
    Driver dr;

    public Taxi(int plateNumber, Engine en,  Driver dr) {
        this.plateNumber = plateNumber;
        this.en = en;
        this.dr = dr;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "plateNumber=" + plateNumber +
                ", en=" + en +
                ", dr=" + dr +
                '}';
    }

    public static void main(String[] args) {



    }
}

class Driver{

    String name;
    int driverID;

    public Driver(String name, int driverID) {
        this.name = name;
        this.driverID = driverID;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverID=" + driverID +
                '}';
    }
}


class Engine{

    String type;
    int horsePower;

    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }


}

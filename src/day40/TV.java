package day40;

public class TV {
    String name;
    boolean isOn;
    int currentChannel;


    public int getCurrentChannel(){
        return currentChannel;
    }

    public void setCurrentChannel(int newChannel){

        if(newChannel<0 || newChannel>50){

        }
        if(isOn==true) {
            currentChannel = newChannel;
        }else {
            System.out.println("Turn on the TV first!");
        }

    }

    public void turnOn(){

        if(isOn==false) {
            System.out.println("Turning on TV");
            isOn = true;
        }
    }

    public void turnOff(){
        // if (isOn)
        if(isOn==true) {
            System.out.println("Turning off TV");
            isOn = false;

        }

    }




    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
}

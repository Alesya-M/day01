package day48;

public class Kangaroo implements Bouncible, Boxer {
    String name;
    int jumpDistance;


    @Override
    public void box() {
        System.out.println("Kangaroo "+name+" is boxing");
    }

    @Override
    public void carryChildInThePocket() {

    }


    public Kangaroo(String name, int jumpDistance){
        this.name=name;
        this.jumpDistance=jumpDistance;
    }

    public void eat(){
        System.out.println("Kangaroo "+ name+ " is eating");
    }


    @Override
    public void bounce() {
        System.out.println("This " + name + " can jump " + jumpDistance
                + " meters forward and it would be nice to have " + gravity + " gravity");
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", jumpDistance=" + jumpDistance +
                '}';
    }


}

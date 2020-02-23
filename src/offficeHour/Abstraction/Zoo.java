package offficeHour.Abstraction;

class  Animal{
    public void Talk(){
        System.out.println("Animal is talking");
    }
}

class Tiger extends Animal{

    public void Hunt(){
        System.out.println("Tiger is hunting");
    }

    @Override
    public void Talk(){
        System.out.println("Tiger says ARRRRRR!");
    }
}

class Octopus extends Animal{
    public void Swing(){
        System.out.println("Octopus is swimming");
    }
    public void Talk(){
        System.out.println("Octopus says GOLOGOLO");
    }
}

public class Zoo {

    public static void main(String[] args) {

        Tiger tiger1 = new Tiger();

        Tiger[] Tigers = {tiger1, new Tiger()};

        Octopus octopus1 = new Octopus();
        Octopus[] octopus = {octopus1};

        Animal animal1 = new Tiger();
        animal1.Talk();//cannot call tiger methods because its not a reference type
                       // Animal - is a reference type, only animal methods can be called


        //reference type  refer type     object
                  Animal animal2 = new Octopus();
              animal2.Talk();




    }

}

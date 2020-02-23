package day43;

public class PetStaticPractice {
    public static void main(String[] args) {

        Pet.showGeneralPetInfo();

        //Does not work- not a static method, need an Object
        //Pet.getName();
        Pet p1 = new Pet("cat","yumyum");
        System.out.println("p1 name = " + p1.getName());
        p1.speak();
    }
}

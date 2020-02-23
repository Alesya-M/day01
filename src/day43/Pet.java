package day43;

public class Pet {

    private String type;
    private String name;

    public Pet() {
        this.type = "Unknown";
        this.name = "Unknown";
    }

    public Pet(String type, String name) {
        this.type = type;
        this.name = type;
    }


    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    public static void showGeneralPetInfo(){
        System.out.println("Pets are friends of humans");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak() {
        switch (type.toLowerCase()) {
            case "cat":
                System.out.println("MEOW");
                break;
            case "dog":
                System.out.println("woof");
                break;
            case "COW":
                System.out.println("moo");
                break;
            case "horse":
                System.out.println("neinei");
                break;
            default:
                break;
        }

    }
}

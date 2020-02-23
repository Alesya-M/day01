package day53;

public class Orange extends Fruit {
    int vitaminC;

    public Orange(String taste, String color,int vitaminC) {
        super(taste, color);
        this.vitaminC = vitaminC;
    }

    @Override
    public void getDigested() {
        System.out.println("Orange is "+ color+ " color "+ " and it has "+ taste+" with vitamin C level of "+ vitaminC);
    }

    @Override
    public String toString() {
        return "Orange{" +
                "vitaminC=" + vitaminC +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

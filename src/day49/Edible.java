package day49;

public interface Edible {

    public static final boolean IS_HUMAN_FOOD= true;


    void eat();
    public abstract void drink();
    public default void digest(){
        System.out.println("Implemented new code!");
    }
}

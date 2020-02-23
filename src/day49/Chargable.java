package day49;

public interface Chargable {
    public default void Charge() {
        System.out.println("Charging");
    }
}

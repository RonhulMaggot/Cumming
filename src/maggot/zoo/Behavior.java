package maggot.zoo;

public interface Behavior {
    void sounds();

    default void shit() {
        System.out.println("Classical shit.");
    }
}

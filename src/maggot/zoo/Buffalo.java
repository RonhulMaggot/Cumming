package maggot.zoo;

public class Buffalo extends Animal {
    boolean horns;

    Buffalo(boolean horns) {
        super("Буффало", Type.HERBIVOROUS, 3, "Травка");
        this.horns = horns;
    }

    public void sounds() {
        System.out.println("МУУУУУ?");
    }

    @Override
    public void printInfo() {
        System.out.println(name);
        System.out.println(translateType());
        System.out.println("Коэффициент пушистости: " + fluffiness);
        System.out.println("Любимая еда: " + favoriteFood);
        if (horns == true) {
            System.out.println("Рога в наличии.");
        } else {
            System.out.println("Рогов нема.");
        }
        sounds();
        shit();
    }
}

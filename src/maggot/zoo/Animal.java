package maggot.zoo;

public abstract class Animal implements Behavior {
    protected String name;
    protected Type diet;
    protected int fluffiness;
    protected String favoriteFood;

    Animal(String name, Type diet, int fluffiness, String favoriteFood) {
        this.name = name;
        this.diet = diet;
        this.fluffiness = fluffiness;
        this.favoriteFood = favoriteFood;
    }

    public void printInfo() {
        System.out.println(name);
        System.out.println(translateType());
        System.out.println("Коэффициент пушистости: " + fluffiness);
        System.out.println("Любимая еда: " + favoriteFood);
        sounds();
        shit();
    }

    public String translateType() {
        if (diet == Type.CARNIVOROUS) {
            return "Хищник";
        } else {
            return "Травоядное";
        }
    }
}

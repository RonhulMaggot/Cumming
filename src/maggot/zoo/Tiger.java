package maggot.zoo;

public class Tiger extends Animal {
    int lineNum;

    Tiger(int lineNum) {
        super("Тигр", Type.CARNIVOROUS, 5, "Зёбра");
        this.lineNum = lineNum;
    }

    public void sounds() {
        System.out.println("Аррр!");
    }

    @Override
    public void printInfo() {
        System.out.println(name);
        System.out.println(translateType());
        System.out.println("Коэффициент пушистости: " + fluffiness);
        System.out.println("Любимая еда: " + favoriteFood);
        System.out.println("Число полосок: " + lineNum);
        sounds();
        shit();
    }
}

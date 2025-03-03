package maggot.zoo;

public class Furry extends Animal {
    int swallowedDicksNum;

    Furry(int swallowedDicksNum) {
        super("Фурри", Type.CARNIVOROUS, 5, "Сперма");
        this.swallowedDicksNum = swallowedDicksNum;
    }

    public void sounds() {
        System.out.println("Чмок-чмок-чмок.");
    }

    @Override
    public void printInfo() {
        System.out.println(name);
        System.out.println(translateType());
        System.out.println("Коэффициент пушистости: " + fluffiness);
        System.out.println("Любимая еда: " + favoriteFood);
        System.out.println("Членов заглочено: " + swallowedDicksNum);
        sounds();
        shit();
    }
}

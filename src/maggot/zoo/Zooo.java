package maggot.zoo;

//import java.util.Scanner;


import static maggot.zoo.Zoo.generateZoo;

public class Zooo {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        Zoo zoo = generateZoo();
        zoo.printZooInfo();


    }
}
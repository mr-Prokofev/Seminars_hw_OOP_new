package Seminar_4_HW;

public class Dz {
    public static void main(String[] args) {
        Apple apple = new Apple(2);
        Box<Apple> apples = new Box<>();
        Orange orange = new Orange(3);
        Box<Orange> oranges = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(orange);
        orangeBox.add(orange);
        orangeBox.add(orange);
        apples.add(apple);
        apples.add(apple);
        oranges.add(orange);
        System.out.println(apples.getWeight());
        System.out.println(oranges.getWeight());
        System.out.println(apples.compare(oranges));
        System.out.println(oranges.compare(oranges));
        System.out.println(orangeBox.getWeight());
        oranges.transferFruits(orangeBox);
        System.out.println(oranges.getWeight());
        System.out.println(orangeBox.getWeight());
    }
}

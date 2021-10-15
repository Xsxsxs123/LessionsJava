package Lession6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Кошка: ");
        Animal vaska = new Cat(200,2,2);
        vaska.run(1450);
        vaska.swim(1);

        System.out.println("Собака: ");
        Animal elka = new Dog(500,3,2);
        elka.run(400);
        elka.swim(2);
    }


//    public static void main(String[] args) {
//        Animal vaska = new Cat("Васька");
//        System.out.println(vaska.getAnimalName());
//        vaska.run(600);
//        vaska.swim(1);
//
//        Animal sharik = new Cat("Шарик");
//        System.out.println(sharik.getAnimalName());
//        // Создать массив животных и попробовать написать Animal[0] = new Cat
//        Animal[] animals = new Animal[5];
//        animals[0] = new Cat("Елка");
//        animals[1] = new Dog("Муха");
//        ...
//    }
}
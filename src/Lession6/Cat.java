package Lession6;

public class Cat extends Animal {
    public Cat(int runDistance, int swimDistance, int i) {
        super(runDistance, swimDistance);
    }

//    private int maxRunDistance = 200; // shift + f6 - массовое переименование переменных. // Максимальная дистанция бега.
//    private int maxSwimDistance = 0; // кошка плавать не умеет.
//
//    public Cat(String animalName) {
//        super(animalName);
//    }
//
//    @Override
//    public String getAnimalName() {
//        return animalName;
//    }
//
//
//    // ctrl + r - массовое перемеименование.
//    @Override
//    public void run(int distance) {
//        System.out.println(distance <= maxRunDistance ? "run: true" : "run: false");
//    }
//
//
//    @Override
//    public void swim(double swim) {
//        System.out.println(swim <= maxSwimDistance ? "swim: true, но медленно." : "swim: false, кошка не доплыла!");
//    }
}
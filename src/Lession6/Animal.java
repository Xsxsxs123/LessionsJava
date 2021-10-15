package Lession6;


public abstract class Animal {


    private int runMaxDistance; // Дистанция бега
    private int swimMaxDistance; // Дистанция плавания

    public Animal(int runMaxDistance, int swimMaxDistance) {
        this.runMaxDistance = runMaxDistance;
        this.swimMaxDistance = swimMaxDistance;
    }

    public void run(int runDistance) { // Бегать
        System.out.println("run: " + (runDistance <= runMaxDistance));
    }
    public void swim(int swimDistance) { // Плыть
        System.out.println("swim: " + (swimDistance <= swimMaxDistance));
    }

}
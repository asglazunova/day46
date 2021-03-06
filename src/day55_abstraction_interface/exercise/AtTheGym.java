package day55_abstraction_interface.exercise;

public class AtTheGym {
    public static void main(String[] args) {
        exercise exercise1 = new Running();
        Running running = new Running();
        Swimming swimming = new Swimming();
        FreeWeight freeWeight = new FreeWeight();

        exercise1.start();
        exercise1.perform();
        System.out.println("Running 30 mins - calories = " + exercise1.getCaloriesCount(30));

        running.start();
        running.perform();
        System.out.println("Running 30 mins - calories = " + running.getCaloriesCount(30));

        swimming.start();
        swimming.perform();
        System.out.println("Swimming 30 mins - calories = " + swimming.getCaloriesCount(30));

        freeWeight.start();
        freeWeight.perform();
        System.out.println("Freeweight 30 min - calories = " + freeWeight.getCaloriesCount(30));



    }
}

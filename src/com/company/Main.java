package com.company;

public class Main {

    public static void main(String[] args) {

        Car RedPorche = new Car("Porche", "Carrera",2016);

        Car BlueJetta = new Car();
        BlueJetta .setMake("Volswagen");
        BlueJetta.setModel("Jetta");
        BlueJetta.setMakeYear(2008);

        // set colors
        RedPorche.setColor("red");
        BlueJetta.setColor("blue");

        System.out.println(RedPorche.start());
        System.out.println(BlueJetta.start());
        System.out.println(RedPorche.accelerate());
        System.out.println(BlueJetta.accelerate());
        System.out.println(BlueJetta.stop() + " to have its emission checked.");
        System.out.println(BlueJetta.passEmissionTest());
        RedPorche.setSpeed(50);
        System.out.println("The " + RedPorche.getFullName() + " is going "+ RedPorche.getSpeed() + " mph");
        System.out.println(RedPorche.stop());
        System.out.println("The " + BlueJetta.getFullName()+ " just passed the "+ RedPorche.getFullName()+".");
    }
}

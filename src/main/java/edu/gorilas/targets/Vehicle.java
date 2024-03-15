package edu.gorilas.targets;

public class Vehicle implements Target{
    public Vehicle() {
    }


    @Override
    public void execution(String message) {
        System.out.println("Puerta abierta "+"!");
    }
}

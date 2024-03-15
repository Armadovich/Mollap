package edu.gorilas.filtres;

public class Autorization implements Filter{
    public Autorization() {
    }

    @Override
    public void execution(String message) {
        System.out.println("Autorización OK para "+ message);
    }
}

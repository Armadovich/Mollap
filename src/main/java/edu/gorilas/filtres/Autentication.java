package edu.gorilas.filtres;

public class Autentication implements Filter{
    public Autentication() {
    }

    @Override
    public void execution(String message) {
        System.out.println("Autenticación OK para "+message);
    }
}

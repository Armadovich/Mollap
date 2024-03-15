package edu.gorilas;


import edu.gorilas.admin.TaskProgrammer;
import edu.gorilas.client.Mollapp;
import edu.gorilas.filtres.Autentication;
import edu.gorilas.filtres.Autorization;
import edu.gorilas.targets.Vehicle;

public final class App {
    public static void main(String[] args) {

        /**
         * Configuracion del programador de tareas
         * del sistema con el tipo de target elegido:
         * desde vehiculos a cualquier cosa que admita
         * la recepcion de un mensaje.
         */
        TaskProgrammer programadorTasques = new TaskProgrammer(new Vehicle());

        /**
         * Añadir al sistema las tareas que queremos que el sistema
         * ejecute al recibir la peticion del cliente.
         */
        programadorTasques.setTasks(new Autentication());
        programadorTasques.setTasks(new Autorization());

        /**
         * Configuracion de la app cliente para que
         * ejecute las tareas programades y
         * envie el mensaje al sistema.
         */
        Mollapp mollapp = new Mollapp();
        mollapp.setTaskProgrammer(programadorTasques);
        mollapp.sendPetition("Francesc");
    }
}
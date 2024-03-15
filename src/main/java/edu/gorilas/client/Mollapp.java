package edu.gorilas.client;

import edu.gorilas.admin.TaskProgrammer;

public class Mollapp implements Client{

    private TaskProgrammer taskProgrammer;

    public Mollapp() {
    }

    @Override
    public void setTaskProgrammer(TaskProgrammer taskProgrammer) {
        this.taskProgrammer = taskProgrammer;
    }

    @Override
    public void sendPetition(String message) {
        taskProgrammer.taskExecution(message);
    }
}

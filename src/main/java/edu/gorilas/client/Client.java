package edu.gorilas.client;

import edu.gorilas.admin.TaskProgrammer;

public interface Client {
    void setTaskProgrammer(TaskProgrammer taskProgrammer);

    void sendPetition(String message);
}

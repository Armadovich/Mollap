package edu.gorilas.admin;

import edu.gorilas.filtres.Filter;
import edu.gorilas.targets.Target;

public class TaskProgrammer {
    private Task tasks = null;

    public TaskProgrammer(Target target) {
        this.tasks = new Task();
        tasks.setTarget(target);
    }

    public Task getTasks() {
        return tasks;
    }

    public void setTasks(Filter filter) {
        getTasks().addTask(filter);
    }

    public void taskExecution(String message){
        tasks.execution(message);
    }

}

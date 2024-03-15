package edu.gorilas.admin;

import edu.gorilas.filtres.Filter;
import edu.gorilas.targets.Target;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Task {

    private List<Filter> tasks = new ArrayList<>();

    private Optional<Target> target;

    public Task() {
    }

    public List<Filter> getTasks() {
        return tasks;
    }

    public void setTasks(List<Filter> tasks) {
        this.tasks = tasks;
    }

    public Optional<Target> getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = Optional.ofNullable(target);
    }


    public void addTask(Filter filter){
        getTasks().add(filter);
    }

    public void execution(String message){
        getTasks().forEach(item -> item.execution(message));
        if (getTarget().isPresent()) {
            getTarget().get().execution(message);
        }
    }
}

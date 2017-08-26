/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolorganizer;

import java.sql.Time;
import java.util.Optional;
import javax.print.attribute.standard.DateTimeAtCreation;

/**
 *
 * @author Samir Rehmtulla
 */
public class Task {
    private DateTimeAtCreation dateTimeAtCreation;
    private Time dateTimeWhenStarted;
    private long timeSinceStarting;
    private long activeWorkTime;
    private int priority;
    private int percentComplete;
    private String name;
    private Status status;
    
    public Task() {
        
    }
    
    public Task(Optional<String> name, Optional<Integer> priority, Optional<Status> status) {
        this.priority = priority.get();
        this.name = name.get();
        this.status = status.get();
    }
    
    public void startTask() {
        dateTimeWhenStarted.setDate(0);
    }
    
    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    public int getPriority() {
        return this.priority;
    }
    
    public void setPriority(int priority) {
        this.priority = priority;
    }
    
    
}

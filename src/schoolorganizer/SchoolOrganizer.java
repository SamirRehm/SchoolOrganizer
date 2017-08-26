/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolorganizer;

import java.util.List;

/**
 *
 * @author Samir Rehmtulla
 */
public class SchoolOrganizer {

    private List<Status> statuses;
    private SchoolOrganizerFacade facade;
    
    public void addStatus(String statusName)  {
        Status newStatus = facade.createStatus(statusName);
        this.statuses.add(newStatus);
    }
    
    public void addTask(String taskName, int priority, Status status) {
        Task newTask = facade.createTask(taskName, priority, status);
        facade.addTaskToStatus(newTask, status);
    }
    
    public void moveToStatus(Task task, Status destinationStatus, Status sourceStatus) {
        task.setStatus(destinationStatus);
        facade.addTaskToStatus(task, destinationStatus);
        facade.removeTaskFromStatus(task, sourceStatus);
    }
    
    public List<Status> getStatuses() {
        return this.statuses;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

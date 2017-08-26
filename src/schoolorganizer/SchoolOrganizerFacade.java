/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolorganizer;

import java.util.Optional;

/*
 *
 * @author Samir Rehmtulla
 */
public class SchoolOrganizerFacade {
    
    public Status createStatus(String statusName) {
        return new Status(statusName);
    }

    public Task createTask(String taskName, int priority, Status status) {
        return new Task(Optional.of(taskName), Optional.of(priority), Optional.of(status));
    }

    public void addTaskToStatus(Task newTask, Status status) {
        status.getTasks().add(newTask);
    }
    
    
}

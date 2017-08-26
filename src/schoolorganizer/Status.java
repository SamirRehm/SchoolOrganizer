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
public class Status {
    private String name;
    private List<Task> tasks;
    
    public Status() {
        
    }
    
    public Status(String statusName) {
        this.name = statusName;
    }
    
    public List<Task> getTasks() {
        return this.tasks;
    }
}


package com.mycompany.laba1.Human;

import com.mycompany.laba1.ReaderTicket;

public class Student extends AbstractHuman {
    private String numgroup;
    
    public Student(String firstName, String lastName, ReaderTicket ticket, String numgroup, Typee typee) {
        super(firstName,lastName,ticket,  typee);
        this.numgroup = numgroup;
    }
    
    public String getNumgroup() {
        return numgroup;
    }


    public void setNumgroup(String numgroup) {
        this.numgroup = numgroup;
    }
    
    public String getFIO() {
        String fio = this.getFirstName() + " " + this.getLastName();
                
        return fio;
    }
    
}

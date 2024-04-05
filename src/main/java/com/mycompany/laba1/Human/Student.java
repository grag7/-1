
package com.mycompany.laba1.Human;

import com.mycompany.laba1.ReaderTicket;

public class Student extends AbstractHuman {
    private String numgroup;
    
    public Student(String firstName, String lastName, ReaderTicket ticket, String numgroup) {
        super(firstName,lastName,ticket);
        this.numgroup = numgroup;
    }
    
    public String getNumgroup() {
        return numgroup;
    }


    public void setNumgroup(String numgroup) {
        this.numgroup = numgroup;
    }
    
}

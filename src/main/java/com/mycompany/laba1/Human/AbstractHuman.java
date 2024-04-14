
package com.mycompany.laba1.Human;

import com.mycompany.laba1.ReaderTicket;

public abstract class AbstractHuman {
    private String firstName;
    private String lastName;
    private ReaderTicket readerTicket;
    private Typee typee;
    
    public enum Typee {
         Student, Teacher
    }
    
    
    public AbstractHuman(String firstName, String lastName, ReaderTicket readerTicket,Typee typee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.readerTicket = readerTicket;
        this.typee = typee;
    }
    
    public Typee getTypee() {
        return typee;
    }
    
    public String getFirstName() {
        return firstName;
    }
    

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    
    public String getLastName() {
        return lastName;
    }
    
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
    public ReaderTicket getReaderTicket() {
        return readerTicket;
    }
    
    
    public void setReaderTicket(ReaderTicket readerTicket) {
        this.readerTicket = readerTicket;
    }
    
     public abstract String getFIO();
      
    
    
}

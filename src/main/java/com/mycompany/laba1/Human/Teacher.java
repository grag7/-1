
package com.mycompany.laba1.Human;
import com.mycompany.laba1.ReaderTicket;

public class Teacher extends AbstractHuman {
    private String patronymic;
    
    public Teacher(String firstName, String lastName, ReaderTicket ticket, String patronymic, Typee typee) {
        super(firstName,lastName, ticket, typee);
        this.patronymic = patronymic;
    }
    
    public String getPatronymic() {
        return patronymic;
    }


    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    
    public String getFIO() {
        String fio =  this.getFirstName() + " " + this.getLastName() + " " + this.getPatronymic();
        return fio;
    }
    
}

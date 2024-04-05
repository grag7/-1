
package com.mycompany.laba1.Human;
import com.mycompany.laba1.ReaderTicket;

public class Teacher extends AbstractHuman {
    private String patronymic;
    
    public Teacher(String firstName, String lastName, ReaderTicket ticket, String patronymic) {
        super(firstName,lastName, ticket);
        this.patronymic = patronymic;
    }
    
    public String getPatronymic() {
        return patronymic;
    }


    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    
}


package com.mycompany.laba1.book;


public class StudyBook extends Abstraktbook {
    private String discipline;

    public StudyBook(String namebook, String id, int yearOfRelease, String discipline) {
        super(namebook,  id, yearOfRelease);
        this.discipline = discipline;
    }

   
    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }
}

package com.mycompany.laba1.book;


public abstract class StudyBook extends Abstraktbook {
    private String discipline;

    public StudyBook(String namebook, String id, int yearOfRelease, String discipline, Type type) {
        super(namebook,  id, yearOfRelease,type);
        this.discipline = discipline;
    }

   
    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }
    
    public abstract String getText();
}
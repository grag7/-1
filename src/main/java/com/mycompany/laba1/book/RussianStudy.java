
package com.mycompany.laba1.book;

public class RussianStudy extends StudyBook {
    private String type;

    public RussianStudy(String namebook, String id, int yearOfRelease, String discipline,String type) {
        super(namebook, id, yearOfRelease,  discipline);
        this.type = type;
    }
    
     public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }
}


package com.mycompany.laba1.book;

public class RussianStudy extends StudyBook {
    private String types;

    public RussianStudy(String namebook, String id, int yearOfRelease, String discipline,String types,Type type) {
        super(namebook, id, yearOfRelease,  discipline, type);
        this.types = types;
    }
    
     public String getTypes() {
        return types;
    }


    public void setTypes(String types) {
        this.types = types;
    }
}

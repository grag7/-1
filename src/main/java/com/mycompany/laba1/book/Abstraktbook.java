
package com.mycompany.laba1.book;

public abstract class Abstraktbook {
    private String namebook;
    private String id;
    private int yearOfRelease;
    private Type type;

    
    public enum Type {
         ForeignArtisticLiterature, ForeignStudy, RussianArtisticLiterature, RussianStudy
    }
    public Abstraktbook(String namebook, String id, int yearOfRelease, Type type) {
        this.namebook = namebook;
        this.id = id;
        this.yearOfRelease = yearOfRelease;
        this.type = type;
    }
    
    public Type getType() {
        return type;
    }
    
    
     public String getNamebook() {
        return namebook;
    }

    // Сеттер для поля namebook
    public void setNamebook(String namebook) {
        this.namebook = namebook;
    }

    // Геттер для поля taken
 

    // Геттер для поля id
    public String getId() {
        return id;
    }

    // Сеттер для поля id
    public void setId(String id) {
        this.id = id;
    }

    // Геттер для поля yearOfRelease
    public int getYearOfRelease() {
        return yearOfRelease;
    }

    // Сеттер для поля yearOfRelease
    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
    
     public abstract String getText();
    
}

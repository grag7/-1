
package com.mycompany.laba1.book;


public class RussianArtisticLiterature extends ArtisticLiterature  {
    private String types;

    public RussianArtisticLiterature(String namebook, String id, int yearOfRelease, String genre,String types, Type type) {
        super(namebook, id, yearOfRelease, genre, type);
        this.types = types;
    }
    
    public String getTypes() {
        return types;
    }


    public void setType(String types) {
        this.types = types;
    }
    
}


package com.mycompany.laba1.book;


public class RussianArtisticLiterature extends ArtisticLiterature  {
    private String type;

    public RussianArtisticLiterature(String namebook, String id, int yearOfRelease, String genre,String type) {
        super(namebook, id, yearOfRelease, genre);
        this.type = type;
    }
    
    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }
    
}

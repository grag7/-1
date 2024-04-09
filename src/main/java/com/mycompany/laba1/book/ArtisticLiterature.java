
package com.mycompany.laba1.book;


public class ArtisticLiterature extends Abstraktbook {
     private String genre;

    public ArtisticLiterature(String namebook, String id, int yearOfRelease, String genre, Type type) {
        super(namebook,id, yearOfRelease, type);
        this.genre = genre;
    }


 public String getGenre() {
        return genre;
    }


    public void setGenre(String genre) {
        this.genre = genre;
    }

}

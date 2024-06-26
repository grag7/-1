
package com.mycompany.laba1.book;


public class ForeignArtisticLiterature extends ArtisticLiterature {
    private String language;
    private String nameAutor;

    public ForeignArtisticLiterature(String namebook, String id, int yearOfRelease, String genre, String language, String nameAutor, Type type) {
        super(namebook, id, yearOfRelease, genre, type);
        this.language = language;
        this.nameAutor = nameAutor;
        
        
        
    }
    
    public String getLanguage() {
        return language;
    }


    public void setLanguage(String language) {
        this.language = language;
    }
    
    public String getNameAutor() {
        return nameAutor;
    }


    public void setNameAutor(String nameAutor) {
        this.nameAutor = nameAutor;
    }
    
    
    public String getText() {
        String text = this.getNamebook() + " " 
                                + this.getGenre() + " "
                                + this.getNameAutor() + " " 
                                +  this.getLanguage();
                
        return text;
    }

    
}

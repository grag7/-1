package com.mycompany.laba1.book;

public class ForeignStudy extends StudyBook {
    private String levelEducation;
     private String university;
     private String language;

    public ForeignStudy(String namebook, String id, int yearOfRelease, String discipline, String levelEducation, String university, String language, Type type) {
        super(namebook, id, yearOfRelease, discipline,type);
        this.levelEducation = levelEducation;
        this.university = university;
        this.language = language;
        
    }
     
     
     
     
        public String getLevelEducation() {
        return levelEducation;
    }

  
    public void setLevelEducation(String levelEducation) {
        this.levelEducation = levelEducation;
    }

   
    public String getUniversity() {
        return university;
    }

  
    public void setUniversity(String university) {
        this.university = university;
    }

    public String getLanguage() {
        return language;
    }

   
    public void setLanguage(String language) {
        this.language = language;
    }
     
    
}

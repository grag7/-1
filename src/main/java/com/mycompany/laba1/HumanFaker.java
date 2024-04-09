package com.mycompany.laba1;

import com.github.javafaker.Faker;
import java.util.Locale;

public class HumanFaker {
    private final Faker faker = new Faker(Locale.forLanguageTag("ru"));

    public String generateHuman(int type) {
        String studentName;
        String teacherName;
        switch(type){
            case 1:
                
                    studentName = faker.name().firstName() + " " + faker.name().lastName();
                    return studentName;
                    
            
                
            case 2:
                
                    teacherName = faker.name().fullName();
                    while (teacherName.length() - teacherName.replace(" ", "").length()<2){
                        teacherName = faker.name().fullName();
                    }
                    return teacherName;
                    
        }
       return null;
    }     
}
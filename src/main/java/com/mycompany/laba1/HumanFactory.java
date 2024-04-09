package com.mycompany.laba1;
import com.mycompany.laba1.Human.AbstractHuman;
import com.mycompany.laba1.Human.AbstractHuman.Typee;
import com.mycompany.laba1.Human.Student;
import com.mycompany.laba1.Human.Teacher;
import java.util.ArrayList;



public class HumanFactory {
    private ArrayList< AbstractHuman> listHuman = new ArrayList<>();

    private HumanFaker faker = new HumanFaker();
    
    private AbstractHuman createStudent(String humanName) {
        String[] nameParts = humanName.split(" ");
        ReaderTicket ticket = new ReaderTicket();
            return new Student(nameParts[0], nameParts[1], ticket, "namegroup", Typee.Student);
      
}

    private AbstractHuman createTeacher(String humanName) {
        String[] nameParts = humanName.split(" ");
        ReaderTicket ticket = new ReaderTicket();
            return new Teacher(nameParts[0], nameParts[1], ticket,nameParts[2], Typee.Teacher);
    }

     public void createHuman(int count, int type) {
    AbstractHuman human = null;
    for (int i = 0; i < count; i++) {
        String humanName = faker.generateHuman(type);
        switch(type){
            case 1:
                human = createStudent(humanName);
                break;
            case 2:
                human = createTeacher(humanName);
                break;
        }
        listHuman.add(human);
    } 
}
     
     public ArrayList<AbstractHuman> getListHuman() {
         return listHuman;
     }
     
     public void cleanListHuman() {
         listHuman.removeAll(listHuman);
     }
}
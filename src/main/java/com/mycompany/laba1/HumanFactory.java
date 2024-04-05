package com.mycompany.laba1;
import com.mycompany.laba1.Human.AbstractHuman;
import com.mycompany.laba1.Human.Student;
import com.mycompany.laba1.Human.Teacher;
import java.util.ArrayList;



public class HumanFactory {
    private ArrayList< AbstractHuman> listHuman = new ArrayList<>();

    private HumanFaker faker = new HumanFaker();

     public void createHuman(int count, int type) {
         AbstractHuman human;
         ReaderTicket ticket;
         String[] nameParts;
         for (int i = 0; i < count; i++) {
             String humanName = faker.generateHuman(type);
             switch(type){
            case 1:
                nameParts = humanName.split(" ");
                ticket = new ReaderTicket();
                human = new Student(nameParts[0], nameParts[1], ticket, "PASKA KAKASHKA");
                listHuman.add(human);
                break;
            case 2:
                nameParts = humanName.split(" ");
                ticket = new ReaderTicket();
                human = new Teacher(nameParts[0], nameParts[1], ticket,nameParts[2]);
                listHuman.add(human);
                break;

        }
         }
        }
     
     public ArrayList<AbstractHuman> getListHuman() {
         return listHuman;
     }
     
     public void cleanListHuman() {
         listHuman.removeAll(listHuman);
     }
}
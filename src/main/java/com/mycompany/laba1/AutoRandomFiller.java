
package com.mycompany.laba1;

import com.mycompany.laba1.Human.AbstractHuman;
import com.mycompany.laba1.book.Abstraktbook;


public class AutoRandomFiller {
    private HumanFactory humanFactory;
    private BookFactory bookFactory;
    
    public AutoRandomFiller (){
        this.humanFactory = new HumanFactory();
        this.bookFactory = new BookFactory();
        generateAll();
    }
        
    public HumanFactory getHumanFactory() {
        return humanFactory;
    }
    
    public BookFactory getBookFactory() {
        return bookFactory;
    }
    
    public void initializeHumans() {
       humanFactory.createHuman(50, 1);
       humanFactory.createHuman(50, 2);
    }
    
    public void assignBooksToHumans() {
        for (AbstractHuman human: humanFactory.getListHuman()){
            ReaderTicket ticket = human.getReaderTicket();
            for(Abstraktbook book: bookFactory.getListBooks()) {
                int chance = (int)(Math.random()*7 + 1);
                if(chance == 1){ // Шанс присванивания книги 1/8 (0.125%)
                    
                    ticket.addBookToList(book);
                }
            }
        }
    }
    
    public void generateAll() {
        humanFactory.cleanListHuman();
        bookFactory.cleanListBooks();
        bookFactory.readBooksFromFile();
        initializeHumans();
        assignBooksToHumans();
    }
    
    public void reassignBooks() {
        for (AbstractHuman human: humanFactory.getListHuman()){
            human.getReaderTicket().cleanListOfBooks();
        }
        assignBooksToHumans();
    }
    
    
    
}
    


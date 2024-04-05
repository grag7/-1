package com.mycompany.laba1;

import com.mycompany.laba1.book.Abstraktbook;
import java.util.ArrayList;


public class ReaderTicket {
    private final ArrayList<Abstraktbook> ListOfBooks = new ArrayList<>();
    private static int quantity = 0;
    private int idTicket;
    
    public ReaderTicket() {
        this.idTicket++;
        
    }
    
    public ArrayList<Abstraktbook> getListOfBooks() {
        return ListOfBooks;
    }
    
    public void addBookToList(Abstraktbook book) {
        ListOfBooks.add(book);
        quantity++;
    }
    
    public void cleanListOfBooks(){
        ListOfBooks.removeAll(ListOfBooks);
    }
            
    
}

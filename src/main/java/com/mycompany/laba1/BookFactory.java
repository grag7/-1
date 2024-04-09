package com.mycompany.laba1;


import com.mycompany.laba1.book.Abstraktbook;
import com.mycompany.laba1.book.Abstraktbook.Type;
import com.mycompany.laba1.book.ForeignArtisticLiterature;
import com.mycompany.laba1.book.ForeignStudy;
import com.mycompany.laba1.book.RussianArtisticLiterature;
import com.mycompany.laba1.book.RussianStudy;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class BookFactory {
    private ArrayList<Abstraktbook> listBooks;
    private int id = 1;

    public BookFactory() {
        this.listBooks = new ArrayList<>();
        readBooksFromFile();
    }

    // Метод для чтения списка книг из файла txt и добавления их в listBooks
    public void readBooksFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(
                "src/main/java/com/mycompany/laba1/book.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Разбиваем строку по разделителю ";" и получаем массив значений
                String[] parts = line.split(";");
                createBook(parts);
                
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    

  
    
    }

    private void createBook(String[] parts) {
        Abstraktbook book;
        switch  (Integer.parseInt(parts[parts.length-1])) {
            
            case 1:
                book = new RussianStudy(parts[0], String.valueOf(id++), Integer.parseInt(parts[2]),parts[3],parts[4],Type.RussianStudy );
                 break;
            case 2:
                book = new ForeignStudy(parts[0], String.valueOf(id++), Integer.parseInt(parts[2]), parts[3],parts[4],parts[5],parts[6],Type.ForeignStudy);
                 break;
            case 3:
                book = new RussianArtisticLiterature(parts[0], String.valueOf(id++), Integer.parseInt(parts[2]), parts[3],parts[4],Type.RussianArtisticLiterature);
                 break;
            case 4:
                book = new ForeignArtisticLiterature(parts[0], String.valueOf(id++), Integer.parseInt(parts[2]), parts[3],parts[4],parts[1],Type.ForeignArtisticLiterature);
                 break;
                
            default:
                throw new IllegalArgumentException("Invalid book type. ");
        }
        listBooks.add(book);
    }
    
    public ArrayList<Abstraktbook> getListBooks() {
        return listBooks;
    }
    
    public void cleanListBooks() {
        listBooks.removeAll(listBooks);
    }
}

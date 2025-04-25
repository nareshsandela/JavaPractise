package org.example;

import org.springframework.beans.factory.annotation.Autowired;

import java.awt.print.Book;

public class InversionOfControlExample {
  class BookController{

      //tradtional approach for creating objects
      BookService objbookService = new BookService();

      //using spring boot inside controller can be done using @Autowired
      @Autowired
      BookService bookService;


  }
    public static void main (String args[]){
    }
}

package com.example.demo.controller;


import com.example.demo.ORM.entity.JpaBook;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/book/{id}")
    public JpaBook getBookById(@PathVariable long id){
        JpaBook book = bookService.getBookById(id);
        return book;
    }

    @PostMapping("/book")
    public String save(@RequestBody JpaBook book){
        bookService.save(book);
        return "save the book";
    }



}

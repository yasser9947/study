package com.example.demo.service;

import com.example.demo.ORM.entity.JpaBook;
import com.example.demo.ORM.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;


    public JpaBook getBookById(Long id){
        JpaBook jpaBook = bookRepository.findById(id).get();
        return jpaBook;
    }

    public void save(JpaBook book){
        // make your logic
        bookRepository.save(book);
    }


    public List<JpaBook> getAll(){
        List<JpaBook> jpaBookList = bookRepository.findAll();
        return jpaBookList;
    }

}

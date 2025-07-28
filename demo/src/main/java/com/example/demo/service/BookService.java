package com.example.demo.service;

import com.example.demo.ORM.entity.JpaBook;
import com.example.demo.ORM.repository.BookRepository;
import com.example.demo.dto.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;


    public JpaBook getBookById(Long id){
        JpaBook jpaBook = bookRepository.findById(id).get();
        return jpaBook;
    }

    public Response<?> save(JpaBook book){
        Response<Object> response = new Response();

        // make your logic
        if (book.getPrice() == null){
            response.setMessage("please add price");
            response.setStatus("ERROR");
            return  response;
        }
        if (book.getPrice() > 900 ){
            response.setMessage("please add price");
            response.setStatus("ERROR");
            return response;
        }
        bookRepository.save(book);
        response.setMessage("save the book successfully");
        response.setStatus("SUCCESS");
        return response ;
    }


    public List<JpaBook> getAll(){
        List<JpaBook> jpaBookList = bookRepository.findAll();
        return jpaBookList;
    }

}

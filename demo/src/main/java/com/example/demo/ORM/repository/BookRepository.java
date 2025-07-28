package com.example.demo.ORM.repository;


import com.example.demo.ORM.entity.JpaBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<JpaBook , Long> {
}

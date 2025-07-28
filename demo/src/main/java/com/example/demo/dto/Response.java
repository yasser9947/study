package com.example.demo.dto;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Response<T> {
    private String status;
    private String message;
    private T data;
}

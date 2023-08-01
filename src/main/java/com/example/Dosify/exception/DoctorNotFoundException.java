package com.example.Dosify.exception;

import javax.print.Doc;

public class DoctorNotFoundException extends Exception{
    public DoctorNotFoundException(String message){
        super(message);
    }
}

package com.mac190.exception;

public class MyException extends Exception{
    int code;
    public MyException(int c, String message){
        super(message);
        code = c;
    }
    public String getMessage(){
        return "Code " + code +": " + super.getMessage();
    }
}

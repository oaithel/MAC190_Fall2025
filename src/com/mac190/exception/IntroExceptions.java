package com.mac190.exception;
/*
Exceptions are an elegant way of handling unexpected errors.
Two different kind of exceptions:
Checked exceptions: Where the try-catch block is required, usually user exceptions, FileExceptions, IOExceptions
Unchecked exceptions: Where the try-catch block is not required. NullPointerException, any system exception that
we cannot recover from is unchecked
Tu use a checked exception, or call a code that might throw a checked exception we use the following:

try{
    code that could trigger a checked exception
 }catch(The kind of exception the code might throw){
        handle the exception
}finally{
    Any code that needs to be executed in all cases whether there is an exception or there isn't.
}

 */

import java.util.NoSuchElementException;
import java.util.Scanner;

public class IntroExceptions {
    public static void throwMeCheckedException(int num) throws Exception{
        if(num < 0){
            System.out.println("I am not throwing my exception");
            throw new MyException(10, " num negative");
        }if(num > 0){
            //throw a checked exception.
            throw new Exception("num is positive: " + num);
            //if a checked exception is not handled where it is triggered, then it needs to be forwarded
            //to the caller, using throws directive
        }else{
            int res = 12/num;
        }
    }
    public static void throwMeUnCheckedException(int num) {
        if(num < 0){
            System.out.println("I am not throwing unchecked anything");
        }else{
            //throw a checked exception.
            throw new NoSuchElementException("num is positive throwing an unchecked exception");
            //if a checked exception is not handled where it is triggered, then it needs to be forwarded
            //to the caller, using throws directive
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        try {
            throwMeCheckedException(n);
            System.out.println("Number is " + n);
        }catch(MyException e){
            System.out.println("Caught MyException: " + e.getMessage());
            //e.printStackTrace();
        }catch(Exception e){
            System.out.println("Caught Exception: " + e.getMessage());
    }
        finally{
            System.out.println("This will be printed in all cases");
        }

        throwMeUnCheckedException(n);
       /* try {
            throwMeUnCheckedException(n);
        }catch(NoSuchElementException e){
            System.out.println("Caught exception: " + e.getMessage());
            e.printStackTrace();
        }
        */
    }
}

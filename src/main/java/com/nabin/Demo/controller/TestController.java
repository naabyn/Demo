package com.nabin.Demo.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {

    @GetMapping(value = "/test")
    public String getMyTest(){
        return "Hello World ";
    }

    @GetMapping(value ="/testParams")
    public String getMyParams(@RequestParam(value ="para")String params,
                              @RequestParam(value ="from_date")@DateTimeFormat(pattern = "yyyy-MM-dd")Date fromdate,
                              @RequestParam(value = "to_date")@DateTimeFormat(pattern ="yyyy-MM-dd")Date todate){
        return params +"\n "+" From Date:"+fromdate+" "+todate;

    }
    @GetMapping(value = "books/{book_id}/page/{page_number}")
    public String bookdetails(@PathVariable(value = "book_id")long bookId,
                              @PathVariable(value = "page_number")long pageNumber){
        return "Book Details\n"+"  ID:"+bookId+"\n "+"Page number:"+pageNumber;
    }

}

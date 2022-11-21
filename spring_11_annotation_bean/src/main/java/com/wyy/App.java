package com.wyy;

import com.wyy.dao.BookDao;
import com.wyy.service.BookService;
import com.wyy.service.impl.BookServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = ctx.getBean(BookService.class);
        System.out.println(bookService);

    }



}

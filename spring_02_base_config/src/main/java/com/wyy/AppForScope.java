package com.wyy;

import com.wyy.service.BookService;
import com.wyy.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForScope {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService1 = ctx.getBean("bookService", BookService.class);
        BookService bookService2 = ctx.getBean("bookService", BookService.class);


        System.out.println(bookService1);
        System.out.println(bookService2);
    }

}

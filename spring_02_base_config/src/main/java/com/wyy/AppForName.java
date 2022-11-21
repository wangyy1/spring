package com.wyy;

import com.wyy.service.BookService;
import com.wyy.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForName {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService2 = ctx.getBean("bookService2", BookService.class);

        bookService2.save();
    }

}

package com.wyy;

import com.wyy.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");


        BookDao bookDao = ctx.getBean("bookDao", BookDao.class);

        bookDao.save();
    }

}

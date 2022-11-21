package com.wyy;

import com.wyy.dao.BookDao;
import com.wyy.service.BookService;
import com.wyy.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifeCyle {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");


        BookDao bookDao = ctx.getBean("bookDao", BookDao.class);

        bookDao.save();
//        ctx.close(); // 1.如果测试destroy 销毁，需要关闭容器
//        ctx.registerShutdownHook();// 2.如果测试destroy 销毁，需要注册关闭钩子
    }

}

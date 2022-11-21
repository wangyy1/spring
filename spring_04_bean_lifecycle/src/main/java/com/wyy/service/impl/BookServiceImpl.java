package com.wyy.service.impl;

import com.wyy.dao.BookDao;
import com.wyy.dao.impl.BookDaoImpl;
import com.wyy.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * spring 中的 初始化和销毁
 */
public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {

    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("BookService save ...");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("server destroy ...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("server init ...");
    }
}

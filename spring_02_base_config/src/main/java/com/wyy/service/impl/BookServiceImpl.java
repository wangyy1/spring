package com.wyy.service.impl;

import com.wyy.dao.BookDao;
import com.wyy.dao.impl.BookDaoImpl;
import com.wyy.service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("BookService save ...");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}

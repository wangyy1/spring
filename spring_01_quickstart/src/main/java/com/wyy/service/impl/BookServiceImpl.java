package com.wyy.service.impl;

import com.wyy.dao.BookDao;
import com.wyy.dao.impl.BookDaoImpl;
import com.wyy.service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao bookService = new BookDaoImpl();

    @Override
    public void save() {
        System.out.println("BookService save ...");
        bookService.save();
    }
}

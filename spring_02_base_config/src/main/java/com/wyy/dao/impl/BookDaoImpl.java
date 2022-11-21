package com.wyy.dao.impl;

import com.wyy.dao.BookDao;

public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book save ...");
    }
}

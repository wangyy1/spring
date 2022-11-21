package com.wyy.dao.impl;

import com.wyy.dao.BookDao;

public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book save ...");
    }


    public void init() {
        System.out.println("init...");
    }

    public void destory() {
        System.out.println("destory...");
    }
}

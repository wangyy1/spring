package com.wyy;

import com.wyy.service.BookService;
import com.wyy.service.impl.BookServiceImpl;

public class App {

    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }

}

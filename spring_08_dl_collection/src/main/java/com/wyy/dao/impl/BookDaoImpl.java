package com.wyy.dao.impl;

import com.wyy.dao.BookDao;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class BookDaoImpl implements BookDao {

    private int[] array;

    private List<String> list;

    private Set<String> set;

    private Map<String, String> map;

    private Properties properties;

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public void save() {
        System.out.println(array);
        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
        System.out.println(properties);
    }


}

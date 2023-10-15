package com.example.pizza.dao;

import java.util.List;

public interface Dao <T> {
    boolean create(T o);
    boolean update(T o);
    boolean delete (T o);
    List <T> findALL();
    T findById(int d);
}

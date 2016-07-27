/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shriya.entity.dao.impl;

import com.shriya.entity.BookCategory;
import com.shriya.entity.dao.BookCategoryDAO;



/**
 *
 * @author shneha
 */
public class BookCategoryDAOImpl implements BookCategoryDAO  {
    private BookCategory[] BookCategoryList = new BookCategory[10];
    private int counter = 0;

    @Override
    public boolean insert(BookCategory s) {
        if (BookCategoryList.length == counter) {
            return false;
        } else {
            BookCategoryList[counter] = s;
        }
        counter++;
        return true;
    }

    @Override
    public boolean update(BookCategory s) {
        if (BookCategoryList.length == counter) {
            return false;
        } else {
            BookCategoryList[counter] = s;
        }
        counter++;
        return true;
    }

    @Override
    public boolean delete(int id) {
        for (int i = 0; i < BookCategoryList.length; i++) {
            BookCategory s = BookCategoryList[i];
            if (s != null && s.getId() == id) {
                BookCategoryList[i] = null;
                return true;
            }

        }
        return false;
    }

    @Override
    public BookCategory getById(int id) {
        
        for (int i = 0; i < BookCategoryList.length; i++) {
            BookCategory s = BookCategoryList[i];
            if (s != null && s.getId() == id) {
                BookCategoryList[i] = null;
                return s;
            }

        }
        return null;
    }

    @Override
    public BookCategory[] getAll() {
        return BookCategoryList;
    }
    
    

    
    
    
    
    
    
    
}

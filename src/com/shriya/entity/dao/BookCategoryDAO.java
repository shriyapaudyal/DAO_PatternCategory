/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shriya.entity.dao;

import com.shriya.entity.BookCategory;

/**
 *
 * @author shneha
 */
public interface BookCategoryDAO {
    boolean insert(BookCategory s);
     boolean update(BookCategory s);
     boolean delete(int id);
   BookCategory getById(int id);
 BookCategory [] getAll();
    
    
    
    
    
}

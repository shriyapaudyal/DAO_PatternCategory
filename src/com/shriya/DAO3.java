/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shriya;

import com.shriya.entity.BookCategory;
import com.shriya.entity.dao.BookCategoryDAO;
import com.shriya.entity.dao.impl.BookCategoryDAOImpl;
import java.util.Scanner;

/**
 *
 * @author shneha
 */
public class DAO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BookCategoryDAO BookCategoryDAO = new BookCategoryDAOImpl();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1.Add book:");
            System.out.println("2. Update book:");
            System.out.println("3.Delete book:");
            System.out.println("4.Get by id:");
            System.out.println("5.Dispaly All book:");
            System.out.println("6.Exit:");
            System.out.println("enter your choice[1-6]:");

            switch (input.nextInt()) {
                case 1: {
                    System.out.println("Add a book:");
                    BookCategory s = new BookCategory();
                    System.out.println("Enter ID:");
                    s.setId(input.nextInt());
                    System.out.println("Enter book Name:");
                    s.setNam(input.next());
                    System.out.println("Enter code:");
                    s.setCode(input.nextDouble());
                    System.out.println("Enter Description:");
                    s.setDescription(input.next());
                    System.out.println("Enter genre:");
                    s.setGenre(input.next());
                    System.out.println("Enter price:");
                    s.setPrice(input.nextFloat());
                    if (BookCategoryDAO.insert(s)) {
                        System.out.println("Inserted Sucessfully");
                    } else {
                        System.out.println("Space Full");
                    }

                }

                break;
                case 2: {
                    BookCategory[] c = BookCategoryDAO.getAll();

                    System.out.println("Enter ID to be updated:");
                    int a = input.nextInt();
                    for (int i = 0; i < c.length; i++) {
                        BookCategory BookCategory = c[i];
                       

                        if (BookCategory != null && BookCategory.getId() == a) {

                            System.out.println("Add a book:");
                            BookCategory s = new BookCategory();
                            System.out.println("Enter ID:");
                            s.setId(input.nextInt());
                            System.out.println("Enter book Name:");
                            s.setNam(input.next());
                            System.out.println("Enter code:");
                            s.setCode(input.nextDouble());
                            System.out.println("Enter Description:");
                            s.setDescription(input.next());
                            System.out.println("Enter genre:");
                            s.setGenre(input.next());
                            System.out.println("Enter price:");
                            s.setPrice(input.nextFloat());
                            if (BookCategoryDAO.update(s)) {
                                System.out.println("Inserted Sucessfully");
                            } else {
                                System.out.println("Space Full");
                            }
                        }
                    }
                        break;
                    }
                
            
        
    

                case 3: {
                    BookCategory[] c = BookCategoryDAO.getAll();

                    System.out.println("Enter ID to be deleted:");
                    int a = input.nextInt();
                    for (int i = 0; i < c.length; i++) {
                        BookCategory BookCategory = c[i];

                        if (BookCategory != null && BookCategory.getId() == a)  {

                            BookCategoryDAO.delete(a);

                        }
                    }

                }
                
                break;
                case 4:{ 
                BookCategory[] c = BookCategoryDAO.getAll();


                    System.out.println("Display by id:");
                    System.out.println("Enter ID:");
                    int a = input.nextInt();
                    for (int i = 0; i < c.length; i++) {
                        BookCategory BookCategory = c[i];

                        if (BookCategory != null && BookCategory.getId() == a)  {
                            System.out.println("ID:" + BookCategory.getId());
                            System.out.println("book Name:" + BookCategory.getNam());
                            System.out.println("code:" + BookCategory.getCode());
                            System.out.println("Description:" + BookCategory.getDescription());
                            System.out.println("genre:" + BookCategory.getGenre());
                            System.out.println("price:" + BookCategory.getPrice());

                        }
                    }
                    break;
                }
        
                case 5: {

                     BookCategory[] c = BookCategoryDAO.getAll();


                     for (int i = 0; i < c.length; i++) {
                        BookCategory BookCategory = c[i];

                        if (BookCategory != null ) {
                            System.out.println("ID:" + BookCategory.getId());
                            System.out.println("book Name:" + BookCategory.getNam());
                            System.out.println("code:" + BookCategory.getCode());
                            System.out.println("Description:" + BookCategory.getDescription());
                            System.out.println("genre:" + BookCategory.getGenre());
                            System.out.println("price:" + BookCategory.getPrice());


                        }

                    }


                    break;
                }

                case 6: {
                    System.out.println("Do You Really Want To Exit[y/n]:");
                    if (input.next().equalsIgnoreCase("y")) {
                        System.exit(0);
                    }

                    break;

                }
            }
        }
    }
}

    }
    
}

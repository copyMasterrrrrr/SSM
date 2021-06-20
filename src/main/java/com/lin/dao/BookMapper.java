package com.lin.dao;

import com.lin.pojo.Books;

import java.util.List;

public interface BookMapper {

    //添加一本书
    int addBook(Books books);

    //删除一本书
    int deleteById(int bookID);

    //更新一本书
    int updateBook(Books books);

    //查找一本书
    Books findBook(int bookID);

    //查找所有书
    List<Books> findAllBooks();
}

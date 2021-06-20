package com.lin.service;

import com.lin.dao.BookMapper;
import com.lin.pojo.Books;

import java.util.List;

public class BooksServiceImpl implements BooksService{
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteById(int bookID) {
        return bookMapper.deleteById(bookID);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books findBook(int bookID) {
        return bookMapper.findBook(bookID);
    }

    @Override
    public List<Books> findAllBooks() {
        return bookMapper.findAllBooks();
    }
}

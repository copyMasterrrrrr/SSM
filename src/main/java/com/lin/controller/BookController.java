package com.lin.controller;


import com.lin.pojo.Books;
import com.lin.service.BooksService;
import com.lin.service.BooksServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired()
    @Qualifier("booksServiceImpl")
    private BooksService booksService;

    @RequestMapping("/AllBook")
    public String findAll(Model model){
        List<Books> books = booksService.findAllBooks();
        model.addAttribute("list",books);
        return "AllBook";
    }

    //跳转到添加书籍界面
    @RequestMapping("/jumpToAddBook")
    public String jumpToAddBook(){
        return "addBook";
    }


    //添加书籍
    @RequestMapping("/addBook")
    public String addBook(Books books){
        booksService.addBook(books);
        return "redirect:/books/AllBook";
    }

    //删除书籍
    //RestFul风格
    @RequestMapping("/deleteBook/{bookID}")
    public String deleteBook(@PathVariable("bookID") int bookID){
        booksService.deleteById(bookID);
        return "redirect:/books/AllBook";
    }

    //跳转到修改书籍页面并将要修改书籍通过id查找到那本书，传递给修改页面
    @RequestMapping("/jumpToUpdateBook")
    public String jumpToUpdateBook(int bookID,Model model){
        Books UpBook = booksService.findBook(bookID);
        model.addAttribute("UpBook",UpBook);
        return "updateBook";
    }


    /**修改书籍
     * 修改失败的原因是因为sql语句中的BookID为0 所以修改的是ID为0的书籍数据
     * 并非是事务处理的问题
     * 可以在前端界面设置隐藏域 传入需要修改的bookID
     */
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        booksService.updateBook(books);
        return "redirect:/books/AllBook";
    }




}

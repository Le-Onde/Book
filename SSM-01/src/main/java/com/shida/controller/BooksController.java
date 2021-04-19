package com.shida.controller;


import com.shida.entity.Books;
import com.shida.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BooksController {
    @Autowired
    private BooksService booksService;

    @RequestMapping("/allBook")
    private String getBooksList(Model model){
        List<Books> booksList = booksService.queryAllBooks();
        System.out.println(booksList);
        model.addAttribute("books",booksList);
        return "allBook";
    }

    //去添加页面
    @RequestMapping("/toAddBook")
    public String toAddPaper(){
        return "addBook";
    }
    //添加
    @RequestMapping("/addBook")
    public String addPaper(Books books){
        System.out.println(books);
        booksService.addBooks(books);
        return "redirect:/book/allBook";
    }


    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Model model,int id){
        Books books = booksService.queryByBookID(id);
        System.out.println(books);
        model.addAttribute("book",books);
        return "updateBook";
    }
    @RequestMapping("/updateBook")
    public String updateBook(Model model,Books books){
        System.out.println(books);
        booksService.updateBooks(books);
        Books book = booksService.queryByBookID(books.getBookID());
        model.addAttribute("books",book);
        return "redirect:/book/allBook";
    }
    @RequestMapping("/del/{bookID}")
    public String deleteBook(@PathVariable("bookID") int id){
        booksService.delBooks(id);
        return "redirect:/book/allBook";
    }


}

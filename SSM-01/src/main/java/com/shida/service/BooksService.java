package com.shida.service;

import com.shida.entity.Books;

import java.util.List;

public interface BooksService {
    /*
     * @Author liu-miss
     * @Description //TODO 查询所有书籍
     * @Date 17:34 2021/3/23
     * @Param
     * @return
     **/
    List<Books> queryAllBooks();

    int addBooks(Books books);

    int delBooks(int id);

    int updateBooks(Books books);

    Books queryByBookID(int id);
}

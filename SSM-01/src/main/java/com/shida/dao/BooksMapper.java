package com.shida.dao;

import com.shida.entity.Books;

import java.util.List;

public interface BooksMapper {
    /*
     * @Author liu-miss
     * @Description //TODO 查询所有书籍
     * @Date 17:29 2021/3/23
     * @Param
     * @return
     **/
    List<Books> queryAllBooks();
    
    /*
     * @Author liu-miss
     * @Description //TODO 增加书籍
     * @Date 20:52 2021/3/23
     * @Param
     * @return
     **/
    int addBook(Books books);

    /*
     * @Author liu-miss
     * @Description //TODO 删除书籍
     * @Date 20:52 2021/3/23
     * @Param
     * @return
     **/
    int delBook(int id);

    /*
     * @Author liu-miss
     * @Description //TODO 更新书籍
     * @Date 20:53 2021/3/23
     * @Param
     * @return
     **/
    int updateBook(Books books);
    
    /*
     * @Author liu-miss
     * @Description //TODO 条件查找 根据id查找返回一个book
     * @Date 20:54 2021/3/23
     * @Param
     * @return
     **/
    Books queryByBookId(int id);
}

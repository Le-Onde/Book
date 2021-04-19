package com.shida.service;

import com.shida.dao.BooksMapper;
import com.shida.entity.Books;

import java.util.List;

public class BooksServiceImpl implements BooksService{


    private BooksMapper booksMapper;

    public void setBooksMapper(BooksMapper booksMapper){
        this.booksMapper = booksMapper;
    }
    /*
     * @Author liu-miss
     * @Description //TODO 查询所有书籍
     * @Date 17:38 2021/3/23
     * @Param
     * @return
     **/
    
    public List<Books> queryAllBooks() {
        return booksMapper.queryAllBooks();
    }

    @Override
    public int addBooks(Books books) {
        return booksMapper.addBook(books);
    }

    @Override
    public int delBooks(int id) {
        return booksMapper.delBook(id);
    }

    @Override
    public int updateBooks(Books books) {
        return booksMapper.updateBook(books);
    }

    @Override
    public Books queryByBookID(int id) {
        return booksMapper.queryByBookId(id);
    }
}

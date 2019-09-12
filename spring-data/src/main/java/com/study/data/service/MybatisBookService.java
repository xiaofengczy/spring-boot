package com.study.data.service;

import com.study.data.dao.entity.Book;
import java.util.List;

/**
 * FileName: MybatisBookService Description:
 *
 * @author caozhongyu
 * @create 19-9-12
 */
public interface MybatisBookService {

  int addBook(Book book);

  int updataBook(Book book);

  int deleteBookById(Integer id);

  Book getBookById(Integer id);

  List<Book> getAllBooks();
}

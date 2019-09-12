package com.study.data.service.impl;

import com.study.data.dao.entity.Book;
import com.study.data.dao.mapper.JdbcBookMapper;
import com.study.data.service.JdbcBookService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * FileName: JdbcBookServiceImpl Description:
 *
 * @author caozhongyu
 * @create 19-9-12
 */
@Service
public class JdbcBookServiceImpl implements JdbcBookService {

  @Resource
  private JdbcBookMapper jdbcBookMapper;

  @Override
  public int addBook(Book book) {
    return jdbcBookMapper.addBook(book);
  }

  @Override
  public int updataBook(Book book) {
    return jdbcBookMapper.updataBook(book);
  }

  @Override
  public int deleteBookById(Integer id) {
    return jdbcBookMapper.deleteBookById(id);
  }

  @Override
  public Book getBookById(Integer id) {
    return jdbcBookMapper.getBookById(id);
  }

  @Override
  public List<Book> getAllBooks() {
    return jdbcBookMapper.getAllBooks();
  }
}

package com.study.data.service.impl;

import com.study.data.dao.entity.Book;
import com.study.data.dao.mapper.MybatisBookMapper;
import com.study.data.service.MybatisBookService;
import java.util.List;
import javax.annotation.Resource;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * FileName: MybatisBookServiceImpl Description:
 *
 * @author caozhongyu
 * @create 19-9-12
 */
@Service
public class MybatisBookServiceImpl implements MybatisBookService {

  @Resource
  private MybatisBookMapper mybatisBookMapper;

  @Override
  public int addBook(@Param("book") Book book) {
    return mybatisBookMapper.addBook(book);
  }

  @Override
  public int updataBook(@Param("book") Book book) {
    return mybatisBookMapper.updataBook(book);
  }

  @Override
  public int deleteBookById(Integer id) {
    return mybatisBookMapper.deleteBookById(id);
  }

  @Override
  public Book getBookById(Integer id) {
    return mybatisBookMapper.getBookById(id);
  }

  @Override
  public List<Book> getAllBooks() {
    return mybatisBookMapper.getAllBooks();
  }
}

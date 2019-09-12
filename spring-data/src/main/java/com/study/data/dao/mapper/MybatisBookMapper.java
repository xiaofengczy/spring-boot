package com.study.data.dao.mapper;

import com.study.data.dao.entity.Book;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * FileName: MybatisBookMapper Description:
 *
 * @author caozhongyu
 * @create 19-9-12
 */
@Mapper
public interface MybatisBookMapper {

  int addBook(@Param("book") Book book);

  int updataBook(@Param("book") Book book);

  int deleteBookById(Integer id);

  Book getBookById(Integer id);

  List<Book> getAllBooks();

}

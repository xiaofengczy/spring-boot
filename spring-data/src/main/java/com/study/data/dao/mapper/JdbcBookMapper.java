package com.study.data.dao.mapper;

import com.study.data.dao.entity.Book;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * FileName: JpaBookDao Description:
 *
 * @author caozhongyu
 * @create 19-9-12
 */
@Repository
public class JdbcBookMapper {

  @Resource
  private JdbcTemplate jdbcTemplate;

  public int addBook(Book book) {
    return jdbcTemplate
        .update("insert  into book (name,author) values (?,?)", book.getName(), book.getAuthor());
  }

  public int updataBook(Book book) {
    return jdbcTemplate
        .update("update book set name=? ,author=? where id=?", book.getName(), book.getAuthor(),
            book.getId());
  }

  public int deleteBookById(Integer id) {
    return jdbcTemplate.update("delete  from book where id=?", id);
  }

  public Book getBookById(Integer id) {
    return jdbcTemplate
        .queryForObject("select * from book where id=?", new BeanPropertyRowMapper<>(Book.class),
            id);
  }

  public List<Book> getAllBooks() {
    return jdbcTemplate.query("select * from book", new BeanPropertyRowMapper<>(Book.class));
  }


}

package com.study.data.controller;

import com.study.data.dao.entity.Book;
import com.study.data.service.JdbcBookService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: JpaBookController Description:
 *
 * @author caozhongyu
 * @create 19-9-12
 */
@RestController
public class JpaBookController {

  @Resource
  private JdbcBookService jdbcBookService;

  @PostMapping("/add")
  public int addBook(@RequestBody Book book) {
    return jdbcBookService.addBook(book);
  }

  @PutMapping("/update")
  public int updataBook(@RequestBody Book book) {
    return jdbcBookService.updataBook(book);
  }

  @DeleteMapping("/delete")
  public int deleteBookById(@RequestParam("id") Integer id) {
    return jdbcBookService.deleteBookById(id);
  }

  @GetMapping("/get")
  public Book getBookById(@RequestParam("id") Integer id) {
    return jdbcBookService.getBookById(id);
  }

  @GetMapping("/list")
  public List<Book> getAllBooks() {
    return jdbcBookService.getAllBooks();
  }

}

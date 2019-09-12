package com.study.data.controller;

import com.study.data.dao.entity.Book;
import com.study.data.service.MybatisBookService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: MybatisBookController Description:
 *
 * @author caozhongyu
 * @create 19-9-12
 */
@RestController
@RequestMapping("/mybatis")
public class MybatisBookController {

  @Resource
  private MybatisBookService mybatisBookService;
  @PostMapping("/add")
  public int addBook(@RequestBody Book book) {
    return mybatisBookService.addBook(book);
  }

  @PutMapping("/update")
  public int updataBook(@RequestBody Book book) {
    return mybatisBookService.updataBook(book);
  }

  @DeleteMapping("/delete")
  public int deleteBookById(@RequestParam("id") Integer id) {
    return mybatisBookService.deleteBookById(id);
  }

  @GetMapping("/get")
  public Book getBookById(@RequestParam("id") Integer id) {
    return mybatisBookService.getBookById(id);
  }

  @GetMapping("/list")
  public List<Book> getAllBooks() {
    return mybatisBookService.getAllBooks();
  }


}

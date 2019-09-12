package com.study.nosql.controller;

import com.study.nosql.dao.BookDao;
import com.study.nosql.entity.Book;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: BookController Description:
 *
 * @author caozhongyu
 * @create 19-9-11
 */
@RestController
public class BookController {

  @Resource
  RedisTemplate redisTemplate;

  @Resource
  StringRedisTemplate stringRedisTemplate;

  @Resource
  private BookDao bookDao;

  @Resource
  private MongoTemplate mongoTemplate;

  @GetMapping("/test1")
  public void test1() {
    ValueOperations<String, String> ops1 = stringRedisTemplate.opsForValue();
    ops1.set("name", "三国演义");
    String name = ops1.get("name");
    System.out.println(name);

    ValueOperations ops2 = redisTemplate.opsForValue();
    Book b1 = new Book();
    b1.setId(1);
    b1.setName("红楼梦");
    b1.setAuthor("曹雪芹");
    ops2.set("b1", b1);

    Book book = (Book) ops2.get("b1");
    System.out.println(book);
  }


  @GetMapping("/test2")
  public void test2() {
    List<Book> books = new ArrayList<>();
    Book b1 = new Book();
    b1.setId(1);
    b1.setName("天龙八部");
    b1.setAuthor("金庸");
    books.add(b1);

    Book b2 = new Book();
    b2.setId(2);
    b2.setName("射雕英雄传");
    b2.setAuthor("金庸");
    books.add(b2);
    bookDao.insert(books);
    List<Book> books1 = bookDao.findByAuthorContains("金庸");
    System.out.println(books1);
    Book book = bookDao.findByNameEquals("天龙八部");
    System.out.println(book);
  }

  @GetMapping("/test3")
  public void test3() {
    List<Book> books = new ArrayList<>();
    Book b1 = new Book();
    b1.setId(3);
    b1.setName("鹿鼎记");
    b1.setAuthor("金庸");
    books.add(b1);

    Book b2 = new Book();
    b2.setId(4);
    b2.setName("倚天屠龙记");
    b2.setAuthor("金庸");
    books.add(b2);
    mongoTemplate.insertAll(books);

    List<Book> all = mongoTemplate.findAll(Book.class);
    System.out.println(all);

    Book book = mongoTemplate.findById(3, Book.class);
    System.out.println(book);
  }
}

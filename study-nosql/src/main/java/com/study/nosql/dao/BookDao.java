package com.study.nosql.dao;

import com.study.nosql.entity.Book;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * FileName: BookDao Description:
 *
 * @author caozhongyu
 * @create 19-9-11
 */
public interface BookDao extends MongoRepository<Book,Integer> {

  List<Book> findByAuthorContains(String author);

  Book findByNameEquals(String name);
}

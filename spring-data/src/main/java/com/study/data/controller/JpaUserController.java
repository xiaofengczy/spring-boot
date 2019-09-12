package com.study.data.controller;

import com.study.data.dao.entity.Book;
import com.study.data.dao.entity.User;
import com.study.data.dao.mapper.JpaUserMapper;
import com.study.data.service.JPAUserService;
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
public class JpaUserController {

  @Resource
  private JPAUserService jpaUserService;

  @PostMapping("/jpa/addUser")
  public Integer addUser(@RequestBody User user) {
    return jpaUserService.addUser(user);
  }

  @PostMapping("/jpa/updateUser")
  public int updataUser(@RequestBody User user) {
    return jpaUserService.updataUser(user);
  }

  @DeleteMapping("/jpa/deleteUserById")
  public int deleteUserById(@RequestParam("id") Integer id) {
    jpaUserService.deleteUserById(id);
    return 1;
  }

  @GetMapping("/jpa/getUserById")
  public User getUserById(Integer id) {
    return jpaUserService.getUserById(id);
  }

  @GetMapping("/jpa/getAllUsers")
  public List<User> getAllUsers() {
    return jpaUserService.getAllUsers();
  }

  @GetMapping("/jpa/getUserByUserNameStartingWith")
  public List<User> getUserByUserNameStartingWith(String userName) {
    return jpaUserService.getUserByUserNameStartingWith(userName);
  }

  @GetMapping("/jpa/getMaxIdUser")
  public User getMaxIdUser() {
    return jpaUserService.getMaxIdUser();
  }

  @GetMapping("/jpa/getUserByIdAndUserName")
  public List<User> getUserByIdAndUserName(String name, Integer id) {
    return jpaUserService.getUserByIdAndUserName(name, id);
  }

}

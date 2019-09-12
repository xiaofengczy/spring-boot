package com.study.data.service;

import com.study.data.dao.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.Query;

/**
 * FileName: MybatisBookService Description:
 *
 * @author caozhongyu
 * @create 19-9-12
 */
public interface JPAUserService {

  Integer addUser(User user);

  int updataUser(User user);

  int deleteUserById(Integer id);

  User getUserById(Integer id);

  List<User> getAllUsers();

  List<User> getUserByUserNameStartingWith(String userName);

  User getMaxIdUser();

  List<User> getUserByIdAndUserName(String userName,Integer id);
}

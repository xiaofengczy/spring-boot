package com.study.data.service.impl;

import com.study.data.dao.entity.User;
import com.study.data.dao.mapper.JpaUserMapper;
import com.study.data.service.JPAUserService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * FileName: JpaUserService Description:
 *
 * @author caozhongyu
 * @create 19-9-12
 */
@Service
public class JpaUserServiceImpl implements JPAUserService {

  @Resource
  private JpaUserMapper jpaUserMapper;

  @Override
  public Integer addUser(User user) {
    return jpaUserMapper.save(user).getId();
  }

  @Override
  public int updataUser(User user) {
    return jpaUserMapper.save(user).getId();
  }

  @Override
  public int deleteUserById(Integer id) {
    jpaUserMapper.deleteById(id);
    return 1;
  }

  @Override
  public User getUserById(Integer id) {
    return jpaUserMapper.getUserById(id);
  }

  @Override
  public List<User> getAllUsers() {
    return jpaUserMapper.findAll();
  }

  @Override
  public List<User> getUserByUserNameStartingWith(String userName) {
    return jpaUserMapper.getUserByUserNameStartingWith(userName);
  }

  @Override
  public User getMaxIdUser() {
    return jpaUserMapper.getMaxIdUser();
  }

  @Override
  public List<User> getUserByIdAndUserName(String name, Integer id) {
    return jpaUserMapper.getUserByIdAndUserName(name, id);
  }
}

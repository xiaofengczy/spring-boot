package com.study.data.dao.mapper;

import com.study.data.dao.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * FileName: JpaUserMapper Description:
 *
 * @author caozhongyu
 * @create 19-9-12
 */
public interface JpaUserMapper extends JpaRepository<User, Integer> {

  List<User> getUserByUserNameStartingWith(String userName);

  User getUserById(Integer id);

  @Query(value = "select u from t_user u where u.id=(Select max(id) from t_user)")
  User getMaxIdUser();

  @Query("select u from t_user u where u.id>:id and u.userName=:userName")
  List<User> getUserByIdAndUserName(@Param("userName") String userName, @Param("id") Integer id);

//  @Query("select u from t_user u where u.id<?2 and u.name like %?1%")
//  List<User> getUserByIdAndUserName(String name, Integer id);

}

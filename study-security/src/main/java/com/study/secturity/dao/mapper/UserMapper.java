package com.study.secturity.dao.mapper;

import com.study.secturity.dao.entity.Role;
import com.study.secturity.dao.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * FileName: UserMapper Description:
 *
 * @author caozhongyu
 * @create 19-9-10
 */
@org.apache.ibatis.annotations.Mapper
public interface UserMapper{

  User loadUserByUsername(@Param("username") String username);

  List<Role> getUserRolesByUid(@Param("id") Integer id);

  int saveUser(User user);

  User getUserById(Integer userId);
}
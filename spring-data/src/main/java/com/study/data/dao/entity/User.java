package com.study.data.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

/**
 * FileName: User Description:
 *
 * @author caozhongyu
 * @create 19-9-12
 */
@Entity(name = "t_user")
@Data
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "user_name")
  private String userName;

  @Column(name="user_password")
  private String userPassword;

}

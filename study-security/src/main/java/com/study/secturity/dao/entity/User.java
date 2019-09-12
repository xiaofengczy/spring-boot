package com.study.secturity.dao.entity;

import lombok.Data;

/**
 * FileName: User Description:
 *
 * @author caozhongyu
 * @create 19-9-10
 */
@Data
public class User {

  private int id;

  private String username;

  private String password;

  private Byte enabled;

  private Byte locked;
}
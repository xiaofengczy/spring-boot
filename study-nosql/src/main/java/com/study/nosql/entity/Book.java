package com.study.nosql.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * FileName: Book Description:
 *
 * @author caozhongyu
 * @create 19-9-11
 */
@Data
public class Book implements Serializable {
  /**id*/
  private int id;

  /**用户名*/
  private String name;

  /**作者*/
  private String author;
}

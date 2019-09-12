package com.study.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * FileName: DataApp Description:
 *
 * @author caozhongyu
 * @create 19-9-12
 */
@SpringBootApplication
public class DataApp {

  public static void main(String[] args) {
    SpringApplication.run(DataApp.class, args);
  }

}

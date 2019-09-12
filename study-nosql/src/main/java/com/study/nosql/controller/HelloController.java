package com.study.nosql.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: HelloController Description:
 *
 * @author caozhongyu
 * @create 19-9-11
 */
@RestController
public class HelloController {

  @Value("${server.port}")
  String port;

  @PostMapping("/save")
  public String saveName(String name, HttpSession session) {
    session.setAttribute("name", name);
    return port;
  }

  @GetMapping("/get")
  public String getName(HttpSession session){
    return port +":" + session.getAttribute("name").toString();
  }




}

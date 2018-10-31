package cn.learn.microservicecloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello Controller.
 *
 * @author shaoyijiong
 * @date 2018/7/6
 */
@Controller
public class HelloController {

  @ResponseBody
  @RequestMapping("/hello")
  public String hello() {
    System.out.println("8002");
    return "hello world";
  }

  @RequestMapping("/success")
  public String success() {
    return "success";
  }
}

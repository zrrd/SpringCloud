package cn.learn.springboot.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class TbUser implements Serializable {

  private Integer id;


  private String name;


  private Integer age;
}
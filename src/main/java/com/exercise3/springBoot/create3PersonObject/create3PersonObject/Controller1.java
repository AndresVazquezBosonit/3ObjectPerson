package com.exercise3.springBoot.create3PersonObject.create3PersonObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {

  @Autowired
  @Qualifier("createPersonBean1")
  Person personBean1;

  @Autowired
  @Qualifier("createPersonBean2")
  Person personBean2;

  @Autowired
  @Qualifier("createPersonBean3")
  Person personBean3;

  @GetMapping("/controlador/bean/{bean}")
  public Person createPerson(@PathVariable("bean") String bean) {
    System.out.println(bean);
    if (bean.equalsIgnoreCase("bean1")) {
      return personBean1;
    } else if (bean.equalsIgnoreCase("bean2")) {
      return personBean2;
    } else if (bean.equalsIgnoreCase("bean3")) {
      return personBean3;
    }
    return null;
  }
}

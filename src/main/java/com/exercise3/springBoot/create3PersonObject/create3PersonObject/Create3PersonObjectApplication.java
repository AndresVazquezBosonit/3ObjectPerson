package com.exercise3.springBoot.create3PersonObject.create3PersonObject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Create3PersonObjectApplication {

  public static void main(String[] args) {
    SpringApplication.run(Create3PersonObjectApplication.class, args);
    System.out.println("//////---------------READY---------------//////");
  }

  @Bean
  public Person createPersonBean1() {
    Person personBean1 = new Person("bean1");
    return personBean1;
  }

  @Bean
  public Person createPersonBean2() {
    Person personBean2 = new Person("bean2");
    return personBean2;
  }

  @Bean
  Person createPersonBean3() {
    Person personBean3 = new Person("bean3");
    return personBean3;
  }
}

package com.spartacus.demo;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
public class HelloWorld {

  @QueryMapping(name = "helloWorld")
  public String helloWorld() {
    return "Hello World";
  }
}

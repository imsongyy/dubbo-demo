package com.dy.service.impl;

import com.dy.service.TestService;

public class TestServiceImpl
  implements TestService
{
  public String sayHello(String msg)
  {
    return msg + " service2 say hello word service2!    ";
  }
}

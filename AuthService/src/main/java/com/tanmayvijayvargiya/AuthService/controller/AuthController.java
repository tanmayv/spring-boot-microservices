package com.tanmayvijayvargiya.AuthService.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.tanmayvijayvargiya.AuthService.connectors.UserConnector;
import com.tanmayvijayvargiya.AuthService.model.Authorization;
import com.tanmayvijayvargiya.AuthService.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.io.UnsupportedEncodingException;

@RestController()
public class AuthController {
  UserConnector userConnector;
  EurekaClient eurekaClient;

  public AuthController(UserConnector userConnector, EurekaClient eurekaClient) {
    this.userConnector = userConnector;
    this.eurekaClient = eurekaClient;
  }

  @PostMapping("/authenticate")
  User authenticateUser(@RequestParam("username") String username,
                                 @RequestParam("password") String password)
      throws UnsupportedEncodingException {
      InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("user-service",false);
      System.out.println("-----------------");
      System.out.println("Hostname " + instanceInfo.getHostName());
      System.out.println("Hostname " + instanceInfo.getIPAddr());
      System.out.println("Hostname " + instanceInfo.getIPAddr());
      System.out.println("Hostname " + instanceInfo.getPort());
      System.out.println("Hostname " + instanceInfo.getSecurePort());
      System.out.println("Hostname " + instanceInfo.getHomePageUrl());
      System.out.println("-----------------");
      User user = userConnector.getUserFromUsername(username);
      return user;
  }
}

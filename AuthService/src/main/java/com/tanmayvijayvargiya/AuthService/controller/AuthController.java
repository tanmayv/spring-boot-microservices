package com.tanmayvijayvargiya.AuthService.controller;

import com.tanmayvijayvargiya.AuthService.connectors.UserConnector;
import com.tanmayvijayvargiya.AuthService.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.io.UnsupportedEncodingException;

@RestController()
public class AuthController {
  UserConnector userConnector;

  public AuthController(UserConnector userConnector) {
    this.userConnector = userConnector;
  }

  @PostMapping("/authenticate")
  User authenticateUser(@RequestParam("username") String username,
                        @RequestParam("password") String password)
      throws UnsupportedEncodingException {
    User user = userConnector.getUserFromUsername(username);
    return user;
  }
}

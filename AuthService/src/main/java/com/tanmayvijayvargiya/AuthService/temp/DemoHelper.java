package com.tanmayvijayvargiya.AuthService.temp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DemoHelper {
  static List<User> users = new ArrayList<>();

  static {
    users.add(User.builder().username("tanmay").password("password").build());
  }

  public static Optional<User> findUser(String username, String password) {
    for(User user: users) {
      if(user.username.equals(username) && user.password.equals(password)) {
        return Optional.of(user);
      }
    }
    return Optional.empty();
  }

}

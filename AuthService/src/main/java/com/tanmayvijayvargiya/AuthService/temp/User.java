package com.tanmayvijayvargiya.AuthService.temp;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class User {
  String username;
  String password;
}

package com.tanmayvijayvargiya.AuthService.model;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
  UUID id;
  String username;
  String password;
  String name;
}

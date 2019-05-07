package com.tanmayvijayvargiya.AuthService.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Authorization {
  String accessToken;
  TokenType tokenType;
  long expiresIn;
  String refreshToken;
}

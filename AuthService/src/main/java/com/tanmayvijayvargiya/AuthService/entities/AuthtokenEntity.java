package com.tanmayvijayvargiya.AuthService.entities;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AuthtokenEntity {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private UUID id;
  private String accessToken;
}

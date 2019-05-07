package com.tanmayvijayvargiya.UserService.entities;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Builder
@Setter
@Table(name = "User")
public class UserEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  UUID id;

  String username;
  String password;
  String name;

  public UserEntity(UUID id, String username, String password, String name) {
    this.username = username;
    this.password = password;
    this.name = name;
    this.id = id;
  }

  public UserEntity() {

  }
}

package com.tanmayvijayvargiya.UserService.controller;

import com.tanmayvijayvargiya.UserService.entities.UserEntity;
import com.tanmayvijayvargiya.UserService.repositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("v1/user")
public class UserController {
  private UserRepository userRepository;

  public UserController(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @PostMapping("")
  public UserEntity createUser(@RequestParam("username") String username, @RequestParam("password") String password,
                               @RequestParam("name") String name) {

    if(username.isEmpty() || password.isEmpty() || name.isEmpty()) {
      return null;
    }
    UserEntity userEntity = UserEntity.builder().username(username).password(password).name(name).build();
    return userRepository.save(userEntity);
  }

  @GetMapping("")
  public UserEntity getUser(@RequestParam("username") String username) {

    if(username.isEmpty()) {
      return null;
    }
    return userRepository.findByUsername(username).get();
  }

}

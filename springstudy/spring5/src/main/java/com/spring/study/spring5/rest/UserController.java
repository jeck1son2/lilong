package com.spring.study.spring5.rest;

import com.spring.study.spring5.domain.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/12/13.
 */
@RequestMapping("/api")
@RestController
public class UserController {
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public ResponseEntity<User> getUser(){
        User user = new User();
        user.setName("初音");
        user.setAge(18);
        user.setSex("女");
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
}

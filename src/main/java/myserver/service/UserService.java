package myserver.service;

import myserver.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
}

package myserver.service.impl;

import myserver.model.User;
import myserver.service.UserService;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> findAll() {
        List<User> users = new LinkedList<>();
        users.add(new User(1L, "Ann", "ann@ukr.net"));
        users.add(new User(1L, "Ann", "ann@ukr.net"));
        users.add(new User(1L, "Ann", "ann@ukr.net"));
        users.add(new User(1L, "Ann", "ann@ukr.net"));
        users.add(new User(1L, "Ann", "ann@ukr.net"));
        users.add(new User(1L, "Ann", "ann@ukr.net"));
        users.add(new User(1L, "Ann", "ann@ukr.net"));
        users.add(new User(1L, "Ann", "ann@ukr.net"));
        users.add(new User(1L, "Ann", "ann@ukr.net"));
        users.add(new User(1L, "Ann", "ann@ukr.net"));
        return users;
    }
}

package myserver.service.impl;

import myserver.model.User;
import myserver.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public List<User> save(User user) {
        return null;
    }

    @Override
    public List<User> update(User user) {
        return null;
    }

    @Override
    public List<User> delete(Long id) {
        return null;
    }
}

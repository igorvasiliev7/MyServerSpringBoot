package myserver.service.impl;

import myserver.model.User;
import myserver.repository.UserRepository;
import myserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.LinkedList;
import java.util.List;

import static org.springframework.util.Assert.notNull;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findOne(Long id) {
        notNull(id, "id is null");
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User save(User user) {
        notNull(user,"user");
        if (userRepository.findByEmail(user.getEmail()) != null) {
            System.out.println("Duplicate email");
            return null;
        }
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        notNull(user, "user is null");
        return userRepository.saveAndFlush(user);
    }

    @Override
    public boolean delete(Long id) {
        notNull(id, "id is null");
        userRepository.deleteById(id);
        return !userRepository.findById(id).isPresent();
    }
}

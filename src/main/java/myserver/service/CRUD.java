package myserver.service;

import myserver.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

public interface CRUD<T> {
    public List<T> findAll();
    public List<T> save(T t);
    public List<T> update(User user);
    public List<T> delete(Long id);
}

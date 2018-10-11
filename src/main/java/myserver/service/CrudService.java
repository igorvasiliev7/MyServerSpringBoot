package myserver.service;

import myserver.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

public interface CrudService<T, ID> {

    List<T> findAll();

    T findOne(ID id);

    T save(T entity);

    T update(T entity);

    boolean delete(ID id);
}

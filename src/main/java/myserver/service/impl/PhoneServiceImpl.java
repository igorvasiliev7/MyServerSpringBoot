package myserver.service.impl;

import myserver.model.Phone;
import myserver.model.User;
import myserver.service.PhoneService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {


    @Override
    public List<Phone> findAll() {
        return null;
    }

    @Override
    public List<Phone> save(Phone phone) {
        return null;
    }

    @Override
    public List<Phone> update(User user) {
        return null;
    }

    @Override
    public List<Phone> delete(Long id) {
        return null;
    }
}

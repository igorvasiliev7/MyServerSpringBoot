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
    public Phone findOne(Long id) {
        return null;
    }

    @Override
    public Phone save(Phone phone) {
        return null;
    }

    @Override
    public Phone update(Phone phone) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}

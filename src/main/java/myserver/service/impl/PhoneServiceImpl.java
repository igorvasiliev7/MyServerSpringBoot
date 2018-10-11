package myserver.service.impl;

import myserver.model.Phone;
import myserver.model.User;
import myserver.repository.PhoneRepository;
import myserver.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    PhoneRepository phoneRepository;

    @Override
    public List<Phone> findAll() {

        return phoneRepository.findAll();
    }

    @Override
    public Phone findOne(Long id) {
        Assert.notNull(id, "id is null");
        return phoneRepository.findById(id).orElse(null);
    }

    @Override
    public Phone save(Phone phone) {
        Assert.notNull(phone, "phone is null");
        return phoneRepository.save(phone);
    }

    @Override
    public Phone update(Phone phone) {
        Assert.notNull(phone, "phone is null");
        return phoneRepository.saveAndFlush(phone);
    }

    @Override
    public boolean delete(Long id) {
        Assert.notNull(id, "id is null");
        phoneRepository.deleteById(id);

        return !phoneRepository.findById(id).isPresent();
    }
}

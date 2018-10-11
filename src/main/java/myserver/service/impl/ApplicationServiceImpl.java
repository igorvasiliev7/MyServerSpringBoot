package myserver.service.impl;

import myserver.model.Application;
import myserver.model.User;
import myserver.service.ApplicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService{

    @Override
    public List<Application> findAll() {
        return null;
    }

    @Override
    public Application findOne(Long id) {
        return null;
    }

    @Override
    public Application save(Application application) {
        return null;
    }

    @Override
    public Application update(Application application) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}

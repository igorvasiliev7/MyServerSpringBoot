package myserver.service.impl;

import myserver.controller.ApplicationController;
import myserver.model.Application;
import myserver.model.User;
import myserver.repository.ApplicationRepository;
import myserver.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService{

    @Autowired
    ApplicationRepository applicationRepository;

    @Override
    public List<Application> findAll() {

        return applicationRepository.findAll();
    }

    @Override
    public Application findOne(Long id) {

        Assert.notNull(id, "is is null");

        return applicationRepository.findById(id).orElse(null);
    }

    @Override
    public Application save(Application application) {

        Assert.notNull(application,"Application is not null");

        return applicationRepository.save(application);
    }

    @Override
    public Application update(Application application) {

        Assert.notNull(application, "Application is null");
        return applicationRepository.saveAndFlush(application);
    }

    @Override
    public boolean delete(Long id) {

        Assert.notNull(id, "id is null");
        applicationRepository.deleteById(id);

        return !applicationRepository.findById(id).isPresent();
    }
}

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
    public List<Application> save(Application application) {
        return null;
    }

    @Override
    public List<Application> update(User user) {
        return null;
    }

    @Override
    public List<Application> delete(Long id) {
        return null;
    }
}

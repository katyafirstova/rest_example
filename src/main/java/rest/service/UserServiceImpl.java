package rest.service;

import org.springframework.stereotype.Service;
import repository.UserRepository;
import rest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void create(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> readAll() {
        return userRepository.findAll();
    }

    @Override
    public User read(int id) {
        return userRepository.getById(id);
    }

    @Override
    public boolean update(User user, int id) {
        if(userRepository.existsById(id)) {
            user.setId(id);
            userRepository.save(user)
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        if(userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

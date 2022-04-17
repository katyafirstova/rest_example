package rest.service;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rest.model.User;

import java.util.List;


@Service("userService")
public class UserService {

    UserDao userDao;

    @Transactional
    public User addUser(User user) {
        return userDao.addUser(user);

    }
    @Transactional
    public List<User> getUsers() {
        return (List<User>) userDao.getUsers();
    }

    @Transactional
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Transactional
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

}


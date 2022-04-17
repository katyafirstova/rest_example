package rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import rest.model.User;
import rest.service.UserService;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/getUsers", method = RequestMethod.GET, headers = "Accept=application/json")
    public List getUsers() {
        List listOfUsers = userService.getUsers();
        return listOfUsers;
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST, headers = "Accept=application/json")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT, headers = "Accept=application/json")
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);

    }

    @RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
    public void deleteUser(@PathVariable(name = "id") int id) {
        userService.deleteUser(id);
    }

}

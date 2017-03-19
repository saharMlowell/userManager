package com.manage.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.manage.model.User;
import com.manage.database.DatabaseClass;

/**
 * Created by slowell on 3/16/17.
 */
public class UserService {
    private Map<String, User> users = DatabaseClass.getUsers();

    public UserService() {
        users.put("saharM", new User(1L, "saharM", "Sahar", "Lowell"));
    }

    public List<User> getAllUsers() {
        return new ArrayList<User>(users.values());
    }

    public User getUser(String userName) {
        return users.get(userName);
    }

    public User addUser(User user) {
        user.setId(users.size() + 1);
        users.put(user.getUserName(), user);
        return user;
    }

    public User updateUser(User user, String userName) {
        if (user.getUserName().isEmpty()) {
            return null;
        }
        user = users.get(user.getUserName());
        User updatedUser = new User(user.getId(), userName, user.getFirstName(), user.getLastName());
        users.remove(user.getUserName());
        users.put(userName, updatedUser);
        //users.put(user.getUserName(), updatedUser);
        return user;
    }

    public User removeUser(String userName) {
        return users.remove(userName);
    }
}

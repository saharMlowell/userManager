package com.manage.service;

import com.manage.database.DatabaseClass;
import com.manage.model.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import java.util.List;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by slowell on 3/19/17.
 */
public class UserServiceTest {
    UserService userService;
    Map<String, User> users;

    @Before
    public void setUp() throws Exception {
        userService = new UserService();
        users = DatabaseClass.getUsers();
    }

    @Test
    public void getAllUsersTestingSize() throws Exception {
        Assert.assertEquals(users.size(), userService.getAllUsers().size());
    }

    @Test
    public void getAllUsersTestingContent() throws Exception {
        List<User> listUsers = userService.getAllUsers();
        for(User usr : listUsers)
            Assert.assertTrue(users.containsValue(usr));
    }

    @Test
    public void getUser() throws Exception {
        Assert.assertTrue(users.containsValue(userService.getUser("saharM")));
    }

    @Test
    public void addUser() throws Exception {
        User newUser = new User();
        newUser.setUserName("hannaL");
        userService.addUser(newUser);
        Assert.assertTrue(users.containsKey("hannaL"));

    }

    @Test
    public void updateUser() throws Exception {
        userService.updateUser(users.get("saharM"), "newUser");
        Assert.assertTrue(users.containsKey("newUser"));
    }

    @Test
    public void removeUser() throws Exception {
        userService.removeUser("saharM");
        Assert.assertTrue(!users.containsKey("saharM"));
    }

}
package com.manage.database;

import java.util.HashMap;
import java.util.Map;

import com.manage.model.User;

/**
 * Created by slowell on 3/16/17.
 */
public class DatabaseClass {
    private static Map<String, User> users = new HashMap<>();


    public static Map<String, User> getUsers() {
        return users;
    }
}

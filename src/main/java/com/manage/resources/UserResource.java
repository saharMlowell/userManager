package com.manage.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.manage.model.User;
import com.manage.service.UserService;

/**
 * Created by slowell on 3/16/17.
 */
@Path("/users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {
    UserService userService = new UserService();

    @GET
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GET
    @Path("/{userName}")
    public User getUser(@PathParam("userName") String userName){
        return userService.getUser(userName);
    }

    @POST
    public User addUser(User user) {
        return userService.addUser(user);
    }

    @PUT
    @Path("/{userName}")
    public User updateUser(@PathParam("userName") String userName, User user) {
        return userService.updateUser(user, userName);
    }

    @DELETE
    @Path("/{userName}")
    public void deleteUser(@PathParam("userName") String userName) {
        userService.removeUser(userName);
    }
}

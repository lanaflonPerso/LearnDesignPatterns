package com.trl.chapter_13.forum;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;


@ApplicationPath("/")
@Path("users")
public class Users2 extends Application {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsers() {
        ArrayList<User> allUsers = this.findAllUsers();
        JsonArrayBuilder jsonArrayBuilder = Json.createArrayBuilder();
        for (User user : allUsers) {
            jsonArrayBuilder.add(Json.createObjectBuilder()
                    .add("id", user.getId())
                    .add("firstname", user.getFirstname())
                    .add("lastname", user.getFirstname()));
        }
        return Response.ok(jsonArrayBuilder.build()).build();
    }

    public ArrayList<User> findAllUsers() {
        ArrayList<User> allUsers = new ArrayList<>();
        allUsers.add(new User(123456, "Alex", "Theedom"));
        allUsers.add(new User(456789, "Murat", "Yener"));
        return allUsers;
    }
}
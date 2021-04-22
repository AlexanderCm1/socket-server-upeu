package edu.upeu.chatspring.model;


import lombok.*;

import java.util.HashSet;
import java.util.Set;


public class User {

    private static User instance;
    private Set<String> users;


    private User(){
        users = new HashSet<>();

    }

    public static synchronized User getInstance(){
        if(instance == null){
            instance = new User();
        }
        return  instance;
    }
    public Set<String> getUsers(){
        return users;
    }
    public void setUser(String userName) throws Exception{
        if(users.contains(userName)){
            throw  new Exception("User alredy exists with login : " + userName);
        }
        users.add(userName);
    }

}

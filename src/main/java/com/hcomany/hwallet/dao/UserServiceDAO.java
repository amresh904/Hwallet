package com.hcomany.hwallet.dao;

import com.hcomany.hwallet.pojo.UserDetails;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class UserServiceDAO {

    HashMap<String,UserDetails> userDetailsList=new HashMap<>();

    public UserDetails createUser(UserDetails user){
        userDetailsList.put(user.getId(),user);
        return user;
    }

    public UserDetails getUser(String userID){

        return userDetailsList.get(userID);
    }


}

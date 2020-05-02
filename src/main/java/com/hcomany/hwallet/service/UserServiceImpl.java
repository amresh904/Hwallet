package com.hcomany.hwallet.service;

import com.hcomany.hwallet.dao.UserServiceDAO;
import com.hcomany.hwallet.pojo.UserDetails;

public class UserServiceImpl implements UserService {
    UserServiceDAO userDAO=new UserServiceDAO();

    @Override
    public UserDetails registerUser(UserDetails userDetails) {
        return  userDAO.createUser(userDetails);
    }

    @Override
    public UserDetails getUserInfo(String userID) {
        return userDAO.getUser(userID);
    }

    @Override
    public UserDetails authenticUser(String userID, String password) {
        return null;
    }
}

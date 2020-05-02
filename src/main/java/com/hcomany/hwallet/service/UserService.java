package com.hcomany.hwallet.service;

import com.hcomany.hwallet.pojo.UserDetails;

public interface UserService {

    public UserDetails registerUser(UserDetails userDetails);

    public UserDetails getUserInfo(String userID);

    public UserDetails authenticUser(String userID, String password);

}

package com.anam.expensetrackapi.service;

import com.anam.expensetrackapi.entity.User;
import com.anam.expensetrackapi.entity.UserModel;

public interface UserService {

    User createUser(UserModel user);

    User readUser(Long id);

    User updateUser(UserModel user, Long id);

    void deleteUser(Long id);
}

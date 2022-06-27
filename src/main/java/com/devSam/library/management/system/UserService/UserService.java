package com.devSam.library.management.system.UserService;

import com.devSam.library.management.system.UserEntity.User;

import java.util.List;
import java.util.Optional;
//import com.devSam.library.management.system.Model.UserModel;
//import com.devSam.library.management.system.Model.UserModel;

public interface UserService {
    User SaveUser(User user);

    List<User> getAllUser();

    Optional<User> findById(Long id);

    void deleteById(Long id);
}

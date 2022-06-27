package com.devSam.library.management.system.UserService;

import com.devSam.library.management.system.UserEntity.User;
//import com.devSam.library.management.system.Model.UserModel;
//import com.devSam.library.management.system.Model.UserModel;
import com.devSam.library.management.system.UserRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.crypto.passwordma.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//    @Override
    public User SaveUser(User user) {
//      User user=new User();
//      user.setFirstName(userModel.getFirstName());
//       user.setLastName(userModel.getLastName());
//       user.setPassword(passwordEncoder.encode(userModel.getPassword()));
//       user.setRole("USER");
        return  userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}

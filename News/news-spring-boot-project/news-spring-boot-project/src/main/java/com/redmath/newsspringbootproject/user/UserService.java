package com.redmath.newsspringbootproject.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public User createUser  (User user)
    {
        return userRepository.save(user);
    }

    public List<User> createUsers (List<User> users)
    {
        return userRepository.saveAll(users);
    }

    public User getUserById (int id)
    {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> getUsers ()
    {
        return userRepository.findAll();
    }
    public User updateUser(User user) {
        Optional<User> optionalUser = userRepository.findById(user.getId());
        User oldUser = null;
        if (optionalUser.isPresent())
        {
            oldUser = optionalUser.get();
            oldUser.setName(user.getName());
            oldUser.setAddress(user.getAddress());
            userRepository.save(oldUser);
        }
        else {
            return new User();
        }
        return oldUser;
    }
    public String deleteUserById(int id)
    {
        userRepository.deleteById(id);
        return "User deleted successfully!";
    }

}

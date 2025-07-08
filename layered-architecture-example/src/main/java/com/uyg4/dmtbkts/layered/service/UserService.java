package com.uyg4.dmtbkt.layered.service;

import com.uyg4.dmtbkt.layered.entity.User;
import com.example.layered.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public User getUserById(Long id) {
        return repository.findById(id);
    }

    public User createUser(User user) {
        return repository.save(user);
    }

    public void deleteUser(Long id) {
        repository.delete(id);
    }
}

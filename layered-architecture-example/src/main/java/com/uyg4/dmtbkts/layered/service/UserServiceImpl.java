package com.uyg4.dmtbkt.layered.service;

import com.uyg4.dmtbkt.layered.entity.Email;
import com.uyg4.dmtbkt.layered.entity.Phone;
import com.uyg4.dmtbkt.layered.entity.User;
import com.uyg4.dmtbkt.layered.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }

    @Transactional
    public User saveUser(User user) {
        if (user.getPhones() != null) {
            for (Phone phone : user.getPhones()) {
                phone.setUser(user);
            }
        }
        if (user.getEmails() != null) {
            for (Email email : user.getEmails()) {
                email.setUser(user);
            }
        }
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

package com.uyg4.dmtbkt.layered.repository;

import com.uyg4.dmtbkt.layered.entity.User;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class UserRepository {

    private Map<Long, User> users = new HashMap<>();
    private Long idCounter = 1L;

    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

    public User findById(Long id) {
        return users.get(id);
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(idCounter++);
        }
        users.put(user.getId(), user);
        return user;
    }

    public void delete(Long id) {
        users.remove(id);
    }

    // Case-sensitive (büyük/küçük harf duyarlı) isim arama
    public List<User> findByNameContaining(String name) {
        return users.values().stream()
                .filter(user -> user.getName() != null && user.getName().contains(name))
                .collect(Collectors.toList());
    }
	// List<User> findByName(String name);  // Case-sensitive arama
}

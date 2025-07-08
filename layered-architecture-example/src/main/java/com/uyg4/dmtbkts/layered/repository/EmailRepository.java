package com.uyg4.dmtbkt.layered.repository;

import com.uyg4.dmtbkt.layered.entity.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {
    // Bir kullanıcıya ait e-postaları bulmak için
    List<Email> findByUserId(Long userId);
}

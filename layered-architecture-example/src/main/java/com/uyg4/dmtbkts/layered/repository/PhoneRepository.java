package com.uyg4.dmtbkt.layered.repository;

import com.uyg4.dmtbkt.layered.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {
    List<Phone> findByUserId(Long userId);
}

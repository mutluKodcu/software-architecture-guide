package com.uyg4.dmtbkt.layered.entity;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "phones")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String phoneNumber;

    @ElementCollection(targetClass = PhoneType.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "phone_types", joinColumns = @JoinColumn(name = "phone_id"))
    @Enumerated(EnumType.STRING)
    private Set<PhoneType> types;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public Phone() {}

    public Phone(String phoneNumber, Set<PhoneType> types, User user) {
        this.phoneNumber = phoneNumber;
        this.types = types;
        this.user = user;
    }

    // Getter & Setterlar

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<PhoneType> getTypes() {
        return types;
    }

    public void setTypes(Set<PhoneType> types) {
        this.types = types;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

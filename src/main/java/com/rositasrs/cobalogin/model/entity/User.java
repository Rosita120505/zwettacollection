package com.rositasrs.cobalogin.model.entity;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Entity
@Table(name = "t_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_user")
    @Column(name = "id_user")
    private Integer userId;
    @Column(name = "username", length = 15, unique = true)
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "nama_lengkap", length = 30)
    private String fullName;
    @Column(name = "email", length = 30)
    private String email;
    @Column(name = "no_hp", length = 15)
    private String noHp;

//    @OneToOne
//    @JoinColumn (name = "id_user", insertable = false, updatable = false)
//    private Address address;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }
}

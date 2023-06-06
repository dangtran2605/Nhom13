package com.Nhom13.Lab8.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.io.Serializable;
@Embeddable
public class UserRoleId implements Serializable {
    @Column(name ="user_id")
    private  Integer user;
    @Column(name="role_id")
    private Integer role;
}

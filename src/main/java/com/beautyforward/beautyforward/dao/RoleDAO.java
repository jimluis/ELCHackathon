package com.beautyforward.beautyforward.dao;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role")
public class RoleDAO 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<UserLoginDAO> users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<UserLoginDAO> getUsers() {
        return users;
    }

    public void setUsers(Set<UserLoginDAO> users) {
        this.users = users;
    }
}
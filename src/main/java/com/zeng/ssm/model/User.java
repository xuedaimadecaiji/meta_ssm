package com.zeng.ssm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * 用户模型
 */
public class User {

    private Integer id;
    private String username;
    private String password;
    private String email;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date updatedAt;

    private List<UserGroup> ownGroups; // 用户所创建的表
    private List<UserGroupData> joinGroups; // 用户所属的表

    public List<UserGroup> getOwnGroups() {
        return ownGroups;
    }

    public void setOwnGroups(List<UserGroup> ownGroups) {
        this.ownGroups = ownGroups;
    }

    public List<UserGroupData> getJoinGroups() {
        return joinGroups;
    }

    public void setJoinGroups(List<UserGroupData> joinGroups) {
        this.joinGroups = joinGroups;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}

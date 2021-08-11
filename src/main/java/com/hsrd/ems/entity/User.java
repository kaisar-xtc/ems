package com.hsrd.ems.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString
@NoArgsConstructor
@Accessors(chain = true)
public class User {
    private String id;
    private String username;
    private String realname;
    private String password;
    private String sex;

    public User(String id, String username, String realname, String password, String sex) {
        this.id = id;
        this.username = username;
        this.realname = realname;
        this.password = password;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

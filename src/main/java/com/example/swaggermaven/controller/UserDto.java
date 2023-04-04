package com.example.swaggermaven.controller;

import com.fasterxml.jackson.annotation.JsonAnyGetter;


public class UserDto {

    private String key;
    private String name;
    private Long points = 0L;

    public UserDto() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setKey(String key) {
        this.key=key;
    }
    public String getKey() {
        return name;
    }
    public UserDto(String key, String name) {
        this.key = key;
        this.name = name;

    }

    public static UserDto of(String key, String value) {
        return new UserDto(key, value);
    }

    // getters and setters

}
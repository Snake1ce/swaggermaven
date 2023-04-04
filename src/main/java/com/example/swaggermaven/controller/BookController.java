package com.example.swaggermaven.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/book")
public class BookController {

    private final RestTemplate restTemplate;

    public BookController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public ResponseEntity<UserDto> getBook(){
        UserDto userDto = restTemplate.getForObject("http://localhost:8081/api/user", UserDto.class);
        assert userDto != null;
        userDto.setName("Fucking shit "+userDto.getName());
        userDto.setKey("Fucking key "+userDto.getKey());
        return ResponseEntity.ok(userDto);
    }
}

package com.example.rest.controller;

import com.example.rest.IHomeClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController implements IHomeClient {

    @GetMapping("/version/{id}")
    @Override
    public  String getVersion(@PathVariable("id") Long id){
        return "{\"version\": 1.0} "+id;
    }
}

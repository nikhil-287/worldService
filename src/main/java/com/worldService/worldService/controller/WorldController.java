package com.worldService.worldService.controller;

import com.worldService.worldService.service.WorldServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class WorldController {

    @Autowired
    WorldServiceImpl helloService;

    @GetMapping("/world")
    public String getHello() {
        return helloService.getWorld();
    }

}
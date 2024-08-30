package com.worldService.worldService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class WorldServiceImplTest {

    @Autowired
    WorldServiceImpl worldService;

    public void getWorldTest() {
        assertEquals("World", worldService.getWorld());
    }
}
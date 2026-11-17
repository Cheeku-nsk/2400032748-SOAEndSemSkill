package com.soa.endexam.controller;

import org.springframework.web.bind.annotation.*;
import com.soa.endexam.service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    private final RestaurantService service;

    public RestaurantController(RestaurantService service) {
        this.service = service;
    }

    @GetMapping("/services")
    public String getServices() {
        return service.displayServices();
    }
}
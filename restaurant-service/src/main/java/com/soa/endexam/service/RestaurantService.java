package com.soa.endexam.service;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

    public String displayServices() {
        return "Restaurant Services: Booking, Online Delivery, Dine-In";
    }
}
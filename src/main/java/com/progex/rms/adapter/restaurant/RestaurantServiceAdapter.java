package com.progex.rms.adapter.restaurant;

import com.progex.rms.resource.restaurant.RestaurantResponse;
import com.progex.rms.resource.restaurant.Restaurant;
import com.progex.rms.service.restaurant.RestaurantService;
import org.springframework.stereotype.Component;

@Component
public class RestaurantServiceAdapter implements RestaurantService {
    @Override
    public Restaurant add(Restaurant restaurant) {
        RestaurantResponse response = RestaurantResponse.builder()
                .id(1)
                .build();
        return Restaurant.builder()
                .restaurant(response)
                .build();
    }
}

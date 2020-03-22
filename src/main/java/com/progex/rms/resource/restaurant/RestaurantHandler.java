package com.progex.rms.resource.restaurant;

import com.progex.rms.service.restaurant.RestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class RestaurantHandler {
    private RestaurantService restaurantService;

    public RestaurantResponse add(RestaurantRequest restaurantRequest) {
        return RestaurantResponse.builder()
                .id(1)
                .build();
    }
}

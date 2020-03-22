package com.progex.rms.resource.restaurant;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Restaurant {
    private final RestaurantResponse restaurant;

    public Restaurant(final RestaurantResponse restaurant) {
        this.restaurant = restaurant;
        final long id = restaurant.getId();
    }
}

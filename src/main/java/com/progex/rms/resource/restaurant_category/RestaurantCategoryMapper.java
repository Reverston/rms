package com.progex.rms.resource.restaurant_category;

import com.progex.rms.core.RestaurantCategory;
import org.springframework.stereotype.Component;

@Component
public class RestaurantCategoryMapper {
    public RestaurantCategoryResponse map(RestaurantCategory restaurantCategory) {
        return RestaurantCategoryResponse.builder()
                .id(restaurantCategory.getId())
                .description(restaurantCategory.getDescription())
                .name(restaurantCategory.getName())
                .build();
    }

    public RestaurantCategory map(RestaurantCategoryCreateRequest restaurantCategoryCreateRequest) {
        return RestaurantCategory.builder()
                .name(restaurantCategoryCreateRequest.getName())
                .description(restaurantCategoryCreateRequest.getDescription())
                .build();
    }
}
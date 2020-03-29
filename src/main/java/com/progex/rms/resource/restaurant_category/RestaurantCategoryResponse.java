package com.progex.rms.resource.restaurant_category;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class RestaurantCategoryResponse {
    private int id;
    private String name;
    private String description;
}

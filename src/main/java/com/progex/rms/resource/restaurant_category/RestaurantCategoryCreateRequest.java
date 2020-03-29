package com.progex.rms.resource.restaurant_category;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
public class RestaurantCategoryCreateRequest {
    private String name;
    private String description;
}
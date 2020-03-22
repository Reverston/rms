package com.progex.rms.resource.category;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RestaurantCategoryResponse {
    private int id;
    private String name;
}

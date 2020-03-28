package com.progex.rms.resource.category;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class RestaurantCategoryResponse {
    private int id;
    private String name;
}

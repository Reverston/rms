package com.progex.rms.resource.restaurant_category;

import lombok.*;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@NoArgsConstructor
public class RestaurantCategoryCreateRequest {
    private String name;
    private String description;
}
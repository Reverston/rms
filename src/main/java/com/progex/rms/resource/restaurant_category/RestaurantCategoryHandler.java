package com.progex.rms.resource.restaurant_category;

import com.progex.rms.restaurant_category.RestaurantCategoryService;
import com.progex.rms.core.RestaurantCategory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class RestaurantCategoryHandler {
    private RestaurantCategoryService restaurantCategoryService;
    private RestaurantCategoryMapper restaurantCategoryMapper;

    public RestaurantCategoryResponse add(RestaurantCategoryCreateRequest restaurantCategoryCreateRequest) {
        RestaurantCategory savedCategory = restaurantCategoryService.save(restaurantCategoryMapper.map(restaurantCategoryCreateRequest));
        return restaurantCategoryMapper.map(savedCategory);
    }
}
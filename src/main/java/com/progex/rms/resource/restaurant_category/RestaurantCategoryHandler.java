package com.progex.rms.resource.restaurant_category;

import com.progex.rms.core.RestaurantCategory;
import com.progex.rms.restaurant_category.RestaurantCategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
@AllArgsConstructor
public class RestaurantCategoryHandler {
    private RestaurantCategoryService restaurantCategoryService;
    private RestaurantCategoryMapper restaurantCategoryMapper;

    public RestaurantCategoryResponse add(RestaurantCategoryCreateRequest restaurantCategoryCreateRequest) {
        RestaurantCategory savedCategory = restaurantCategoryService.save(restaurantCategoryMapper.map(restaurantCategoryCreateRequest));
        return restaurantCategoryMapper.map(savedCategory);
    }

    public List<RestaurantCategoryResponse> getCategories() {
        //TODO to be implemented next
        return Collections.emptyList();
    }
}
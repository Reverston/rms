package com.progex.rms.resource.restaurant_category;

import com.progex.rms.core.RestaurantCategory;
import com.progex.rms.restaurant_category.RestaurantCategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

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
        List<RestaurantCategory> categories = restaurantCategoryService.getAll();
        return categories.stream().map(restaurantCategoryMapper::map)
                .collect(Collectors.toList());
    }
}
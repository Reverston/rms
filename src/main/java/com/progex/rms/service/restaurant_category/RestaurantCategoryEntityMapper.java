package com.progex.rms.service.restaurant_category;

import com.progex.rms.core.RestaurantCategory;
import com.progex.rms.repo.restaurant_category.CategoryEntity;
import org.springframework.stereotype.Component;

@Component
public class RestaurantCategoryEntityMapper {
    public CategoryEntity map(RestaurantCategory restaurantCategory) {
        return CategoryEntity.builder()
                .id(restaurantCategory.getId())
                .name(restaurantCategory.getName())
                .description(restaurantCategory.getDescription())
                .build();
    }

    public RestaurantCategory map(CategoryEntity categoryEntity) {
        return RestaurantCategory.builder()
                .id(categoryEntity.getId())
                .name(categoryEntity.getName())
                .description(categoryEntity.getDescription())
                .build();
    }
}

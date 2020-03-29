package com.progex.rms.resource.restaurant_category;

import com.progex.rms.core.RestaurantCategory;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RestaurantCategoryMapper {
    RestaurantCategoryResponse map(RestaurantCategory restaurantCategory);

    RestaurantCategory map(RestaurantCategoryCreateRequest restaurantCategoryCreateRequest);
}
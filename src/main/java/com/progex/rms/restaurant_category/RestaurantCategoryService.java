package com.progex.rms.restaurant_category;

import com.progex.rms.core.RestaurantCategory;

import java.util.List;

public interface RestaurantCategoryService {
    RestaurantCategory save(RestaurantCategory restaurantCategory);

    List<RestaurantCategory> getAll();
}
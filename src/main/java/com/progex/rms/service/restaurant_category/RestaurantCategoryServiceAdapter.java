package com.progex.rms.service.restaurant_category;

import com.progex.rms.repo.restaurant_category.CategoryEntity;
import com.progex.rms.repo.restaurant_category.RestaurantCategoryRepository;
import com.progex.rms.restaurant_category.RestaurantCategoryService;
import com.progex.rms.core.RestaurantCategory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class RestaurantCategoryServiceAdapter implements RestaurantCategoryService {
    private RestaurantCategoryRepository restaurantCategoryRepository;
    private RestaurantCategoryEntityMapper entityMapper;

    @Override
    public RestaurantCategory save(RestaurantCategory restaurantCategory) {
        CategoryEntity categoryEntity = entityMapper.map(restaurantCategory);
        return entityMapper.map(restaurantCategoryRepository.save(categoryEntity));
    }

    @Override
    public List<RestaurantCategory> getAll() {
       return restaurantCategoryRepository.findAll()
                .stream()
               .map(entityMapper::map)
               .collect(Collectors.toList());
    }
}

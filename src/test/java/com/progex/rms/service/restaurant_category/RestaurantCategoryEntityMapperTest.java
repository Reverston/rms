package com.progex.rms.service.restaurant_category;

import com.progex.rms.core.RestaurantCategory;
import com.progex.rms.repo.restaurant_category.CategoryEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class RestaurantCategoryEntityMapperTest {

    @InjectMocks
    private RestaurantCategoryEntityMapper categoryEntityMapper;

    @Test
    public void testShouldBeAbleToMapRestaurantCategoryToCategoryEntity() {
        //Given
        RestaurantCategory restaurantCategory = RestaurantCategory.builder()
                .description("desc")
                .id(1)
                .name("name")
                .build();

        //When
        CategoryEntity mappedEntity = categoryEntityMapper.map(restaurantCategory);

        //Then
        assertNotNull(mappedEntity);
        assertEquals(restaurantCategory.getDescription(), mappedEntity.getDescription());
        assertEquals(restaurantCategory.getId(), mappedEntity.getId());
        assertEquals(restaurantCategory.getName(), mappedEntity.getName());
    }

    @Test
    public void testShouldBeAbleToMapRestaurantCategoryEntityToRestaurantCategory() {
        //Given
        CategoryEntity categoryEntity = CategoryEntity.builder()
                .description("desc")
                .id(1)
                .name("name")
                .build();

        //When
        RestaurantCategory restaurantCategory = categoryEntityMapper.map(categoryEntity);

        //Then
        assertNotNull(restaurantCategory);
        assertEquals(categoryEntity.getDescription(), restaurantCategory.getDescription());
        assertEquals(categoryEntity.getId(), restaurantCategory.getId());
        assertEquals(categoryEntity.getName(), restaurantCategory.getName());
    }
}
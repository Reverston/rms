package com.progex.rms.resource.restaurant_category;

import com.progex.rms.core.RestaurantCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class RestaurantCategoryMapperTest {

    @InjectMocks
    private RestaurantCategoryMapper restaurantCategoryMapper;

    @Test
    public void testShouldShouldBeAbleToMapRestaurantCategoryCreateRequest(){
        //Given
        RestaurantCategoryCreateRequest categoryCreateRequest = RestaurantCategoryCreateRequest.builder()
                .description("description")
                .name("name")
                .build();

        //When
        RestaurantCategory restaurantCategory = restaurantCategoryMapper.map(categoryCreateRequest);

        //Then
        assertNotNull(restaurantCategory);
        assertEquals(categoryCreateRequest.getName(), restaurantCategory.getName());
        assertEquals(categoryCreateRequest.getDescription(), restaurantCategory.getDescription());
    }

    @Test
    public void testShouldShouldBeAbleToMapRestaurantCategoryResponse(){
        //Given
        RestaurantCategory restaurantCategory = RestaurantCategory.builder()
                .description("description")
                .name("name")
                .id(1)
                .build();

        //When
        RestaurantCategoryResponse restaurantCategoryResponse = restaurantCategoryMapper.map(restaurantCategory);

        //Then
        assertNotNull(restaurantCategoryResponse);
        assertEquals(restaurantCategory.getId(), restaurantCategoryResponse.getId());
        assertEquals(restaurantCategory.getName(), restaurantCategoryResponse.getName());
        assertEquals(restaurantCategory.getDescription(), restaurantCategoryResponse.getDescription());
    }
}
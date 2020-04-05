package com.progex.rms.resource.restaurant_category;

import com.progex.rms.restaurant_category.RestaurantCategoryService;
import com.progex.rms.core.RestaurantCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

@RunWith(MockitoJUnitRunner.class)
public class RestaurantCategoryHandlerTest {

    @InjectMocks
    private RestaurantCategoryHandler restaurantCategoryHandler;
    @Mock
    private RestaurantCategoryService restaurantCategoryService;
    @Mock
    private RestaurantCategoryMapper restaurantCategoryMapper;

    @Test
    public void testShouldBeAbleToAddCategory(){
        //Given
        when(restaurantCategoryMapper.map(any(RestaurantCategoryCreateRequest.class)))
                .thenReturn(mock(RestaurantCategory.class));
        when(restaurantCategoryMapper.map(any(RestaurantCategory.class)))
                .thenReturn(mock(RestaurantCategoryResponse.class));
        when(restaurantCategoryService.save(any(RestaurantCategory.class)))
                .thenReturn(mock(RestaurantCategory.class));
        //When
        RestaurantCategoryResponse response = restaurantCategoryHandler
                .add(mock(RestaurantCategoryCreateRequest.class));

        //Then
        assertNotNull(response);
    }

    @Test
    public void testShouldBeAbleToGetCategories(){
        //Given
        when(restaurantCategoryMapper.map(any(RestaurantCategory.class)))
                .thenReturn(mock(RestaurantCategoryResponse.class));
        when(restaurantCategoryService.getAll())
                .thenReturn(Collections.singletonList(mock(RestaurantCategory.class)));

        //When
        List<RestaurantCategoryResponse> categoryResponseList = restaurantCategoryHandler.getCategories();

        //Then
        assertNotNull(categoryResponseList);
        assertFalse(categoryResponseList.isEmpty());
    }

    @Test
    public void testShouldBeAbleToGetEmptyCategoriesList(){
        //Given
        when(restaurantCategoryService.getAll())
                .thenReturn(Collections.emptyList());

        //When
        List<RestaurantCategoryResponse> categoryResponseList = restaurantCategoryHandler.getCategories();

        //Then
        assertNotNull(categoryResponseList);
        assertTrue(categoryResponseList.isEmpty());
    }
}
package com.progex.rms.service.restaurant_category;

import com.progex.rms.core.RestaurantCategory;
import com.progex.rms.repo.restaurant_category.CategoryEntity;
import com.progex.rms.repo.restaurant_category.RestaurantCategoryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class RestaurantCategoryServiceAdapterTest {

    @InjectMocks
    private RestaurantCategoryServiceAdapter restaurantCategoryServiceAdapter;
    @Mock
    private RestaurantCategoryRepository restaurantCategoryRepository;
    @Mock
    private RestaurantCategoryEntityMapper entityMapper;

    @Test
    public void testShouldBeAbleToSaveCategory() {
        //Given
        RestaurantCategory mockRestaurantCategory = mock(RestaurantCategory.class);
        when(restaurantCategoryRepository.save(any())).thenReturn(mock(CategoryEntity.class));
        when(entityMapper.map(any(RestaurantCategory.class))).thenReturn(mock(CategoryEntity.class));
        when(entityMapper.map(any(CategoryEntity.class))).thenReturn(mock(RestaurantCategory.class));

        //When
        RestaurantCategory savedCategory = restaurantCategoryServiceAdapter.save(mockRestaurantCategory);

        //Then
        assertNotNull(savedCategory);
        verify(restaurantCategoryRepository, times(1)).save(any());
    }
}

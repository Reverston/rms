package com.progex.rms.resource.restaurant_category;


import com.progex.rms.RestaurantApplication;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestaurantCategoryBaseContract {

    @Autowired
    private RestaurantCategoryController restaurantCategoryController;

    @MockBean
    private RestaurantCategoryHandler restaurantCategoryHandler;

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(restaurantCategoryController);
        RestaurantCategoryResponse restaurantCategoryCreateResponse = RestaurantCategoryResponse.builder()
                .id(123)
                .name("name")
                .description("description")
                .build();
        when(restaurantCategoryHandler.add(any(RestaurantCategoryCreateRequest.class))).thenReturn(restaurantCategoryCreateResponse);

        List<RestaurantCategoryResponse> categoryList = Collections.singletonList(restaurantCategoryCreateResponse);
        when(restaurantCategoryHandler.getCategories()).thenReturn(categoryList);
    }
}

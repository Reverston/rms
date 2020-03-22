package com.progex.rms.resource.category;


import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
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
                .build();
        when(restaurantCategoryHandler.add(any(RestaurantCategoryCreateRequest.class))).thenReturn(restaurantCategoryCreateResponse);
    }
}

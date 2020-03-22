package com.progex.rms.resource.restaurant;

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
public class RestaurantRequestBaseContract {

    @Autowired
    private RestaurantController restaurantController;

    @MockBean
    private RestaurantHandler restaurantHandler;

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(restaurantController);
        RestaurantResponse restaurantResponse = RestaurantResponse.builder()
                .name("name")
                .category("category")
                .hotLine("hotline")
                .id(1)
                .build();
        when(restaurantHandler.add(any(RestaurantRequest.class))).thenReturn(restaurantResponse);
    }
}

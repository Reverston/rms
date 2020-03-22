package com.progex.rms.resource.category;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class RestaurantCategoryController {

    private RestaurantCategoryHandler restaurantCategoryHandler;

    @PostMapping("/add-restaurant-category")
    public RestaurantCategoryResponse addRestaurantCategory(
            @RequestHeader("CorrelationId") @NotBlank String correlationId,
            @RequestBody @NotNull RestaurantCategoryCreateRequest restaurantCategoryCreateRequest) {
        return restaurantCategoryHandler.add(restaurantCategoryCreateRequest);
    }
}
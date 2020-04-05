package com.progex.rms.resource.restaurant_category;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class RestaurantCategoryController {

    private RestaurantCategoryHandler restaurantCategoryHandler;

    @PostMapping("/restaurant-category")
    public RestaurantCategoryResponse addRestaurantCategory(
            @RequestHeader("X-Correlation-Id") @NotBlank String correlationId,
            @RequestBody @NotNull RestaurantCategoryCreateRequest restaurantCategoryCreateRequest) {
        return restaurantCategoryHandler.add(restaurantCategoryCreateRequest);
    }

    @GetMapping("/restaurant-category")
    public List<RestaurantCategoryResponse> getRestaurantCategories() {
        return restaurantCategoryHandler.getCategories();
    }
}

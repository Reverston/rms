package com.progex.rms.resource.restaurant;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class RestaurantController {

    private RestaurantHandler restaurantHandler;

    @PostMapping("/add-restaurant")
    public RestaurantResponse addRestaurant(
            @RequestHeader("X-Correlation-Id") @NotBlank String correlationId,
            @RequestBody @NotNull RestaurantRequest restaurantRequest) {
        return restaurantHandler.add(restaurantRequest);
    }
}
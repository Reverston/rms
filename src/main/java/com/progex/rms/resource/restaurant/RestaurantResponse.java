package com.progex.rms.resource.restaurant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class RestaurantResponse {
    private long id;
    private String name;
    private String hotLine;
    private String category;
}

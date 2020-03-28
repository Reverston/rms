package com.progex.rms.resource.restaurant;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class RestaurantResponse {
    private long id;
    private String name;
    private String hotLine;
    private String category;
}

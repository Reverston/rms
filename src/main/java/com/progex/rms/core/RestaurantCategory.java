package com.progex.rms.core;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class RestaurantCategory {
    private int id;
    private String name;
    private String description;
}

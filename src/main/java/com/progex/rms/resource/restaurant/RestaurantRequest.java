package com.progex.rms.resource.restaurant;

import lombok.*;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
public class RestaurantRequest {
    private String name;
    private Address address;
    private Contact hotline;
    private String category;
    private List<Contact> contacts;
    private Location location;
    private int ownerId;
    private boolean parkingAvailability;
    private String summary;
    private String startedDate;
    private List<OpeningInfo> openingHours;

    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    @Getter
    @Builder
    @NoArgsConstructor
    static class Location {
        private String lat;
        private String lon;
    }

    @Getter
    @Builder
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    @NoArgsConstructor
    public static class Address {

        private String street;
        private String postalCode;
        private String addressLine1;
        private String addressLine2;
    }

    @Getter
    @Builder
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    @NoArgsConstructor
    public static class Contact {
        private String countryCode;
        private String number;
    }

    @Builder
    @Getter
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    @NoArgsConstructor
    public static class OpeningInfo {
        private Day day;
        private String openingTime;
        private String closingTime;
    }

    public enum Day {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }
}
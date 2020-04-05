package com.progex.rms.repo.restaurant_category;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "restaurant_category")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
}

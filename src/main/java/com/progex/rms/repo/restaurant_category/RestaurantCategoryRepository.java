package com.progex.rms.repo.restaurant_category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantCategoryRepository extends JpaRepository<CategoryEntity, Integer> {
}
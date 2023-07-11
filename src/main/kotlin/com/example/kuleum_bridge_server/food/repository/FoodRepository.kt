package com.example.kuleum_bridge_server.food.repository

import com.example.kuleum_bridge_server.food.entity.Food
import com.example.kuleum_bridge_server.food.enum.FoodCategory
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FoodRepository : JpaRepository<Food, Long> {
    fun findByOrderByIdAsc(): List<Food>

    fun findByCategory(category: FoodCategory): List<Food>
}
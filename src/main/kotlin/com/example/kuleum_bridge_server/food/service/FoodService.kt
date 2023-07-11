package com.example.kuleum_bridge_server.food.service

import com.example.kuleum_bridge_server.food.enum.FoodCategory
import com.example.kuleum_bridge_server.food.repository.FoodRepository
import org.springframework.stereotype.Service

@Service
class FoodService(
    val foodRepository: FoodRepository
) {
    fun getFoods() = foodRepository.findByOrderByIdAsc()

    fun getFoods(category: FoodCategory) = foodRepository.findByCategory(category)
}
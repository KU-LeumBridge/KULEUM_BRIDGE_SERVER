package com.example.kuleum_bridge_server.food.controller

import com.example.kuleum_bridge_server.common.util.Util.safeValueOf
import com.example.kuleum_bridge_server.food.entity.Food
import com.example.kuleum_bridge_server.food.enum.FoodCategory
import com.example.kuleum_bridge_server.food.service.FoodService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class FoodController(
    val foodService: FoodService
) {
    @GetMapping("/foods")
    fun getFoods() = foodService.getFoods()

    @GetMapping("/foods/{category}")
    fun getFoods(@PathVariable("category") rawCategory: String): List<Food> {
        val category = safeValueOf<FoodCategory>(rawCategory)
            ?: throw IllegalArgumentException("잘못된 카테고리입니다.")

        return foodService.getFoods(category)
    }
}
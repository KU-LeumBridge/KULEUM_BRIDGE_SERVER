package com.example.kuleum_bridge_server.food.enum

enum class FoodCategory(val category: String) {
    한식("한식"),
    분식("분식"),
    디저트("디저트"),
    일식("일식"),
    치킨_햄버거("치킨/햄버거"),
    양식("양식"),
    중식("중식"),
    고기("고기"),
    술집("술집");

    companion object {
        private val map = FoodCategory.values().associateBy { it.category }
        operator fun get(value: String) = map[value]
    }
}
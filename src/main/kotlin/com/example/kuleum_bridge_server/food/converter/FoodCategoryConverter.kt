package com.example.kuleum_bridge_server.food.converter

import com.example.kuleum_bridge_server.food.enum.FoodCategory
import jakarta.persistence.AttributeConverter

class FoodCategoryConverter : AttributeConverter<FoodCategory, String> {
    override fun convertToDatabaseColumn(attribute: FoodCategory?): String {
        return attribute.toString()
    }

    override fun convertToEntityAttribute(dbData: String?): FoodCategory {
        return FoodCategory[dbData.toString()]!!
    }
}

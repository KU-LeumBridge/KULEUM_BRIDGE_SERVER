package com.example.kuleum_bridge_server.food.entity

import com.example.kuleum_bridge_server.common.entity.BaseEntity
import com.example.kuleum_bridge_server.food.converter.FoodCategoryConverter
import com.example.kuleum_bridge_server.food.enum.FoodCategory
import jakarta.persistence.*

@Entity
@Table(name = "food", schema = "PUBLIC", indexes = [Index(columnList = "id")])
class Food(
    @Column(name = "category")
    @Convert(converter = FoodCategoryConverter::class)
    var category: FoodCategory,

    @Column(name = "store_name")
    var storeName: String,

    @Column(name = "address")
    var address: String,

    @Column(name = "latitude")
    var latitude: Double,

    @Column(name = "longitude")
    var longitude: Double,

    @Column(name = "one_line_review")
    var oneLineReview: String,
) : BaseEntity()
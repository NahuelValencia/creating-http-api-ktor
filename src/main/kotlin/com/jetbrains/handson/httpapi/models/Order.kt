package com.jetbrains.handson.httpapi.models

import kotlinx.serialization.Serializable

val orderStorage = listOf(
    Order(
        "1", listOf(
            OrderItem("Ham Sandwich", 2, 5.50),
            OrderItem("Water", 1, 1.50),
            OrderItem("Beer", 3, 2.30),
            OrderItem("Cheesecake", 1, 3.75)
        )
    ),
    Order(
        "2", listOf(
            OrderItem("Cheeseburger", 1, 8.50),
            OrderItem("Water", 2, 1.50),
            OrderItem("Coke", 2, 1.76),
            OrderItem("Ice Cream", 1, 2.35)
        )
    )
)

@Serializable
data class Order(
    val id: String,
    val contents: List<OrderItem>
) {
    val total: Double
        get() {
            var itemTotal = 0.0
            contents.map { item ->
                itemTotal = +item.price * item.amount
            }
            return itemTotal
        }
}


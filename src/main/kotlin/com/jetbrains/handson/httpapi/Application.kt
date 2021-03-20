package com.jetbrains.handson.httpapi

import com.jetbrains.handson.httpapi.models.registerCustomerRoutes
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.serialization.*
import kotlinx.serialization.json.json


fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

//Entry point of our application
fun Application.module() {
    install(ContentNegotiation) {
        json()
    }
    registerCustomerRoutes()
}

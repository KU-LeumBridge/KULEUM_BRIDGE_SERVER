package com.example.kuleum_bridge_server.common.util

object Util {
    inline fun <reified T : Enum<T>> safeValueOf(type: String?): T? {
        return try {
            java.lang.Enum.valueOf(T::class.java, type)
        } catch (e: IllegalArgumentException) {
            null
        }
    }
}
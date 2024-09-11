package com.caracaldevs.target_kotlin_multiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
package com.example.newsarticleapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
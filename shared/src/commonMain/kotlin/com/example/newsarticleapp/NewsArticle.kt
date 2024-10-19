package com.example.newsarticleapp



// Data class for news articles
data class NewsArticle(
    val title: String,
    val description: String,
    val imageUrl: String
)

object NewsRepository {
    // Static list of news articles
    fun getNewsArticles(): List<NewsArticle> {
        return listOf(
            NewsArticle(
                title = "Global Warming: A Critical Issue",
                description = "The world is witnessing alarming climate changes...",
                imageUrl = "https://via.placeholder.com/150"
            ),
            NewsArticle(
                title = "Technology and Innovation in 2024",
                description = "Discover the latest trends in AI, robotics, and more...",
                imageUrl = "https://via.placeholder.com/150"
            ),
            NewsArticle(
                title = "Health and Wellness Tips",
                description = "Explore the best ways to maintain a healthy lifestyle...",
                imageUrl = "https://via.placeholder.com/150"
            )
        )
    }
}

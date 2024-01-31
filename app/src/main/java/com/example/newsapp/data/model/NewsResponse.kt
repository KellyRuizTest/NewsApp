package com.example.newsapp.data.model

import com.example.newsapp.data.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)
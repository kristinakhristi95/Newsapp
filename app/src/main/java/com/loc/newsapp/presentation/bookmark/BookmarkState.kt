//Kristina Khristi 301483429
//Rajan Boudel
//Harikrisnan Parmeswaran
//Maziar Hassanzadeh Moghaddam

package com.loc.newsapp.presentation.bookmark

import com.loc.newsapp.domain.model.Article

data class BookmarkState(
    val articles: List<Article> = emptyList()
)
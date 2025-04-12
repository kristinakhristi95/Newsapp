//Kristina Khristi 301483429
//Rajan Boudel
//Harikrisnan Parmeswaran
//Maziar Hassanzadeh Moghaddam

package com.loc.newsapp.presentation.details

import com.loc.newsapp.domain.model.Article

sealed class DetailsEvent {
    data class UpsertDeleteArticle(val article: Article) : DetailsEvent()

    object RemoveSideEffect : DetailsEvent()

}
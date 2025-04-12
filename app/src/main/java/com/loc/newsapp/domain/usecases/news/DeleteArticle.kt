//Kristina Khristi 301483429
//Rajan Boudel
//Harikrisnan Parmeswaran
//Maziar Hassanzadeh Moghaddam

package com.loc.newsapp.domain.usecases.news

import com.loc.newsapp.data.local.NewsDao
import com.loc.newsapp.domain.model.Article
import javax.inject.Inject

class DeleteArticle @Inject constructor(
    private val newsDao: NewsDao
) {

    suspend operator fun invoke(article: Article){
        newsDao.delete(article = article)
    }

}
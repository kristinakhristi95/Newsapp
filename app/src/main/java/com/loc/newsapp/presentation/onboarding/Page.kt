//Kristina Khristi 301483429
//Rajan Boudel
//Harikrisnan Parmeswaran
//Maziar Hassanzadeh Moghaddam

package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf(
    Page(
        title = "Welcome to our News Chennel",
        description = "Get the latest breaking news, headlines, and updates from trusted sources — all in one place.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Welcome to our News Chennel",
        description = "Customize your feed to see news that matters to you. Choose topics, regions, and interests.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Welcome to our News Chennel",
        description = "Read offline, switch to dark mode, and get alerts so you're always in the know — day or night.",
        image = R.drawable.onboarding3
    )
)
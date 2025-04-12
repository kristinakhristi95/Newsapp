//Kristina Khristi 301483429
//Rajan Boudel
//Harikrisnan Parmeswaran
//Maziar Hassanzadeh Moghaddam

package com.loc.newsapp.domain.usecases

import com.loc.newsapp.domain.usecases.app_entry.ReadAppEntry
import com.loc.newsapp.domain.usecases.app_entry.SaveAppEntry

data class AppEntryUseCases(
    val readAppEntry: ReadAppEntry,
    val saveAppEntry: SaveAppEntry
)

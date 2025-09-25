package com.example.mycuadricula.sampledata

import android.adservices.topics.Topic
import android.os.ext.SdkExtensions
import androidx.annotation.RequiresExtension
import com.example.mycuadricula.R
import com.example.mycuadricula.R.string
import com.example.mycuadricula.R.string.*

object DataSource {
    @RequiresExtension(extension = SdkExtensions.AD_SERVICES, version = 4)
    val topics = listOf(
        Topic(architecture, 58, R.drawable.architecture),
        Topic(crafts, 121, R.drawable.crafts),
        Topic(business, 78, R.drawable.business),
        Topic(culinary, 118, R.drawable.culinary),
        Topic(design, 423, R.drawable.design),
        Topic(fashion, 92, R.drawable.fashion),
        Topic(film, 165, R.drawable.film),
        Topic(gaming, 164, R.drawable.gaming),
        Topic(drawing, 326, R.drawable.drawing),
        Topic(lifestyle, 305, R.drawable.lifestyle),
        Topic(music, 212, R.drawable.music),
        Topic(painting, 172, R.drawable.painting),
        Topic(photography, 321, R.drawable.photography),
        Topic(tech, 118, R.drawable.tech)
    )
}
package com.androidbasics.coursesapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.androidbasics.coursesapp.R

data class Topic (
    @StringRes val nameResourceId: Int,
    val numberOfCourses: Int,
    @DrawableRes val imageResourceId: Int
 )
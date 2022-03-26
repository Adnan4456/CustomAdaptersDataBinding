package com.example.customadapterdatabinding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("imageFromUrl")//use this attribute to set value
//this custom code will run when the value will set.
fun ImageView.imageFromUrl(url: String){

    Glide.with(this.context)
        .load(url).into(this)
}
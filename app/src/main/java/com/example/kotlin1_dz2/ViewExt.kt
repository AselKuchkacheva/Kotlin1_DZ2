package com.example.kotlin1_dz2

import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import javax.microedition.khronos.opengles.GL

var View.visible: Boolean
    get() = visibility == View.VISIBLE
    set(value) {
        visibility = if (value) View.VISIBLE else View.INVISIBLE
    }

var View.invisible: Boolean
    get() = visibility == View.INVISIBLE
    set(value) {
        visibility = if (value) View.VISIBLE else View.GONE
    }

fun ImageView.loadImage(url: String){
    Glide.with(this).load(url).into(this)
}
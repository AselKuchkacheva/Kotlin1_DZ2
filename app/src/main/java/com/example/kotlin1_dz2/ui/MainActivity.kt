package com.example.kotlin1_dz2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import com.example.kotlin1_dz2.R
import com.example.kotlin1_dz2.loadImage
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private var imageList = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addImage()
        selectImage()
        submitImage()
    }

    private fun submitImage() {
        btn_submit_main.setOnClickListener {
            if (!et_link_images_main.text.isNullOrEmpty()){
                imageList.add(et_link_images_main.toString())
            }
        }
    }

    private fun selectImage() {
        btn_random_main.setOnClickListener {
           val s = imageList.random()
            iv_images_choose_random_main.loadImage(s)
        }
    }

    private fun addImage() {
        imageList.add("https://ichef.bbci.co.uk/news/800/cpsprodpb/8D5E/production/_102609163_animals1.jpg")
        imageList.add("https://bipbap.ru/wp-content/uploads/2017/04/6843-1.jpg")
        imageList.add("https://bipbap.ru/wp-content/uploads/2017/04/1-7.jpg")
        imageList.add("https://bipbap.ru/wp-content/uploads/2017/04/2-13.jpg")
        imageList.add("https://bipbap.ru/wp-content/uploads/2017/04/9-1.jpg")
    }

}
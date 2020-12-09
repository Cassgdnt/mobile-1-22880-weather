/*package com.example.mobile_1_22880_weather

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.activity_details.*

class RecyclerDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val title = intent.getStringExtra(CustomViewHolder.DETAIL_TITLE_KEY)
        supportActionBar?.title = title

        countryDescriptionView.text = intent.getStringExtra(CustomViewHolder.Country_description)
        countryTempView.text = intent.getStringExtra(CustomViewHolder.Country_temp)

    }
}*/
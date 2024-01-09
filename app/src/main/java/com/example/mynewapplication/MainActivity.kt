package com.example.mynewapplication

import android.os.Bundle
import android.widget.TableLayout
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.delivery_tab_layout)
    }
}
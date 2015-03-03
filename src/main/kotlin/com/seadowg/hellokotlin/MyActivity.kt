package com.seadowg.hellokotlin

import android.os.Bundle
import com.seadowg.hellokotlin.R;

class MyActivity : android.app.Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.my_activity)
    }
}

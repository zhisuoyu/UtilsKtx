package com.zsy.utilsktx

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import zsy.utils.ArrayUtils
import zsy.utils.extension.addButton
import zsy.wrapper.lg.java.Lg

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ll.addButton("ArrayUtils") {
            ArrayUtils.concat(arrayOf("11", "12", "13"), arrayOf("21", "22", "23"))
                .forEach {
                    Lg.i(it)
                }
        }

    }
}

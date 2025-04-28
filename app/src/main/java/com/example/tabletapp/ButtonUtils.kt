package com.example.tabletapp

import android.view.View
import android.widget.Button
import com.google.android.material.button.MaterialButton

fun setButtonClickListener(vararg buttons: Button, listener: View.OnClickListener){
    buttons.forEach { button ->
        button.setOnClickListener { listener }
    }
}
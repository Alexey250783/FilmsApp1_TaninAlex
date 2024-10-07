package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initButtons()
    }
    private fun initButtons() {
        button_menu.setOnClickListenen {
            Toast.makeText(this, "Меню", Toast.LENGTH_SHORT).show()
        }
        button_fav.setOnClickListenen {
            Toast.makeText(this, "Избранное", Toast.LENGTH_SHORT).show()
        }
        button_watch_later.setOnClickListenen {
            Toast.makeText(this, "Посмотреть позже", Toast.LENGTH_SHORT).show()
        }
        button_selections.setOnClickListenen {
            Toast.makeText(this, "Подборка", Toast.LENGTH_SHORT).show()
        }
        button_settings.setOnClickListenen {
            Toast.makeText(this, "Настройки", Toast.LENGTH_SHORT).show()
        }
    }
}



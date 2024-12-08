package com.example.flashlight  // Переконайтесь, що ваш пакет правильний

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class ColorScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_screen)  // Правильний шлях до XML

        val color = intent.getStringExtra("COLOR")
        val colorScreen = findViewById<RelativeLayout>(R.id.colorScreen)

        // Зміна фону на переданий колір
        if (color != null) {
            colorScreen.setBackgroundColor(Color.parseColor(color))
        }

        // Обробка натискання на кнопку "Назад"
        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            // Повернення на головний екран
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Закриваємо поточну активність
        }
    }

    // Повернення на головний екран при натисканні на кнопку "Назад" на пристрої
    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}

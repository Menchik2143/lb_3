package com.example.flashlight

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.buttonWhite).setOnClickListener { openColorScreen("#FFFFFF") }
        findViewById<Button>(R.id.buttonRed).setOnClickListener { openColorScreen("#FF5252") }
        findViewById<Button>(R.id.buttonBlue).setOnClickListener { openColorScreen("#448AFF") }
        findViewById<Button>(R.id.buttonGreen).setOnClickListener { openColorScreen("#4CAF50") }
        findViewById<Button>(R.id.buttonCyan).setOnClickListener { openColorScreen("#00BCD4") }
        findViewById<Button>(R.id.buttonGray).setOnClickListener { openColorScreen("#BDBDBD") }
        findViewById<Button>(R.id.buttonMagenta).setOnClickListener { openColorScreen("#E040FB") }
    }

    private fun openColorScreen(color: String) {
        val intent = Intent(this, ColorScreenActivity::class.java)
        intent.putExtra("COLOR", color)
        startActivity(intent)
    }
}



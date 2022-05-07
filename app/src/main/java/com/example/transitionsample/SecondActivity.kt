package com.example.transitionsample

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnBack: Button = findViewById(R.id.btnBack)
        val tv: TextView = findViewById(R.id.tv)

        // 渡された値を取り出す⇒テキストに表示
        val text = intent.getStringExtra("TEXT")
        tv.text = text + "さん"

        btnBack.setOnClickListener {
            finish()
        }
    }
}
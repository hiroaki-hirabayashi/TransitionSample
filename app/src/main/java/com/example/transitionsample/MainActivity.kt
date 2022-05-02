package com.example.transitionsample

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // viewの取得
        val btn1: Button = findViewById(R.id.btn1)
        val btn2:Button = findViewById(R.id.btn2)

        // btn1を押したら
        btn1.setOnClickListener {
            // Transaction:処理・取引
            // replace:交換・切り替え（大元のxml , 表示したいFragment）
            supportFragmentManager.beginTransaction()
                .replace(R.id.fl,BlankFragment1.newInstance())
                .commit()
        }

        // btn2を押したら
        btn2.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fl,BlankFragment2.newInstance())
                .commit()
        }
    }
}
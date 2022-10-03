package br.com.android.customviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.android.customviews.component.LabelShowMoneyComponent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<LabelShowMoneyComponent>(R.id.lsmc).money = 123f
    }

}
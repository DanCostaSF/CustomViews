package br.com.android.customviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.android.customviews.component.LabelShowMoneyComponent
import br.com.android.customviews.component.PixManualContentView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<LabelShowMoneyComponent>(R.id.lsmc).money = 123f
        findViewById<PixManualContentView>(R.id.pix).txv_tittle = true
        findViewById<PixManualContentView>(R.id.pix2).imageView = false
        findViewById<PixManualContentView>(R.id.pix3).txv_subtittle = false

    }

}
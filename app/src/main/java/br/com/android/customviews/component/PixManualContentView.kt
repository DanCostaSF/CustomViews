package br.com.android.customviews.component

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import br.com.android.customviews.databinding.PixmanualContentViewBinding

class PixManualContentView @JvmOverloads constructor(
    context: Context,
    private val attrs: AttributeSet? = null,
    private val defStyle: Int = 0,
) : ConstraintLayout(context, attrs, defStyle) {

    private val binding =
        PixmanualContentViewBinding.inflate(LayoutInflater.from(context), this, true)

    init {
        setupAttr()
    }

    private fun setupAttr() {
        binding.root.setOnClickListener { Toast.makeText(context, "a", Toast.LENGTH_SHORT).show() }
    }
}
package br.com.android.customviews.component

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import br.com.android.customviews.R
import br.com.android.customviews.databinding.ViewQueHenriquePediuBinding

class ViewQueHenriquePediu @JvmOverloads constructor(
    context: Context,
    private val attrs: AttributeSet? = null,
    private val defStyle: Int = 0,
) : ConstraintLayout(context, attrs, defStyle) {

    private val binding =
        ViewQueHenriquePediuBinding.inflate(LayoutInflater.from(context), this, true)

    init {
        setupAttr()
    }

    private fun setupAttr() {
        binding.btn.setOnClickListener { Toast.makeText(context, "a", Toast.LENGTH_SHORT).show() }
    }
}
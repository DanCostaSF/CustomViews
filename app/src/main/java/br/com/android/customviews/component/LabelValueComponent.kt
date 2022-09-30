package br.com.android.customviews.component

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import br.com.android.customviews.R
import br.com.android.customviews.databinding.LabelValueComponentBinding

class LabelValueComponent @JvmOverloads constructor(
    context: Context,
    private val attrs: AttributeSet? = null,
    private val defStyle: Int = 0,
) : ConstraintLayout(context, attrs, defStyle) {

    private val binding =
        LabelValueComponentBinding.inflate(LayoutInflater.from(context), this, true)

    init {
        setupAttr()
    }

    private fun setupAttr() {
        val style = context.obtainStyledAttributes(
            attrs, R.styleable.LabelValueComponent, defStyle, 0
        )
        val paramValue = style.getFloat(R.styleable.LabelValueComponent_value, 0f)
        binding.tvValue.text = paramValue.toString()

        binding.root.setOnClickListener {
            Toast.makeText(context, "Clicou $paramValue", Toast.LENGTH_SHORT).show()
        }
    }
}
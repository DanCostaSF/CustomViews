package br.com.android.customviews.component

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import br.com.android.customviews.R
import br.com.android.customviews.databinding.LabelShowMoneyBinding

class LabelShowMoneyComponent @JvmOverloads constructor(
    context: Context,
    private val attrs: AttributeSet? = null,
    private val defStyle: Int = 0,
) : ConstraintLayout(context, attrs, defStyle) {

    private val binding =
        LabelShowMoneyBinding.inflate(LayoutInflater.from(context), this, true)

    init {
        setupAttr()
    }

    @SuppressLint("SetTextI18n")
    private fun setupAttr() {
        val style = context.obtainStyledAttributes(
            attrs, R.styleable.LabelShowMoneyComponent, defStyle, 0
        )
        val paramValue = style.getFloat(R.styleable.LabelShowMoneyComponent_money, 0f)
        binding.txtValor.text = "R$ $paramValue"

        binding.root.setOnClickListener {
            if (binding.txtValor.visibility == View.GONE) {
                binding.txtValor.visibility = View.VISIBLE
                binding.txtvToqueVizualizar.visibility = View.GONE
            } else {
                binding.txtValor.visibility = View.GONE
                binding.txtvToqueVizualizar.visibility = View.VISIBLE
            }
        }
    }
}
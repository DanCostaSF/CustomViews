package br.com.android.customviews.component

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import br.com.android.customviews.R
import br.com.android.customviews.commons.isVisible
import br.com.android.customviews.databinding.PixmanualContentViewBinding

class PixManualContentView @JvmOverloads constructor(
    context: Context,
    private val attrs: AttributeSet? = null,
    private val defStyle: Int = 0,
) : ConstraintLayout(context, attrs, defStyle) {

    var txv_tittle: Boolean? = null
        set(value) {
            binding.txvTittle.isVisible(value)
            field = value
        }

    var txv_subtittle: Boolean? = null
        set(value) {
            binding.txvSubtittle.isVisible(value)
            if (value == false) {
                binding.txvTittle.gravity = Gravity.CENTER_HORIZONTAL
            }
            field = value
        }

    var imageView: Boolean? = null
        set(value) {
            binding.imageView.isVisible(value)
            field = value
        }

    private val binding =
        PixmanualContentViewBinding.inflate(LayoutInflater.from(context), this, true)

    init {
        setupAttr()
    }

    private fun setupAttr() {
        val style = context.obtainStyledAttributes(
            attrs, R.styleable.PixManualContentView, defStyle, 0
        )
        updateParamValue(style)
        onContainerClick()

    }

    private fun updateParamValue(style: TypedArray) {
        txv_tittle = style.getBoolean(R.styleable.PixManualContentView_txv_tittle, true)
        txv_subtittle = style.getBoolean(R.styleable.PixManualContentView_txv_subtittle, true)
        imageView = style.getBoolean(R.styleable.PixManualContentView_imageview, true)
    }

    private fun onContainerClick() {
        binding.root.setOnClickListener { Toast.makeText(context, "a", Toast.LENGTH_SHORT).show() }
    }
}
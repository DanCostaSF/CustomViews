package br.com.android.customviews

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){
    val value = MutableLiveData(0)
}
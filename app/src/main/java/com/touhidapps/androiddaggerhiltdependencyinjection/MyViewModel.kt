package com.touhidapps.androiddaggerhiltdependencyinjection


import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class MyViewModel @Inject constructor(@Named("my_string") string: String) : ViewModel() {

    init {
        println("TTTT : $string") // see on log
    }

}
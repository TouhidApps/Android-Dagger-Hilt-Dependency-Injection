package com.touhidapps.androiddaggerhiltdependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named


// Mark-7
@AndroidEntryPoint // Here inject will happen, it should place in every activity and fragment from where injection happens
class MainActivity : AppCompatActivity() {

    /**
     * Search "Mark-" on the project to find how to implement hilt
     */

    // Mark-8
    @Inject
    @Named("my_string") // will alive entire app lifecycle
    lateinit var myString: String

    // Mark-11
    @Inject
    @Named("my_string_2") // will alive until this activity alive
    lateinit var myString2: String

    private val viewModel: MyViewModel by viewModels()

    // viewModels() come from "androidx.fragment:fragment-ktx:1.3.4" this library

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.tvMain).text =
            "$myString \n $myString2"

    // This will just create view model object and show log to see the initialization, when real use: call some function or property after adding a dot .
        viewModel
    }


}


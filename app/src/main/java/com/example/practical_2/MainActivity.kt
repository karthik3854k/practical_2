package com.example.practical_2


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate is called")
    }

    private fun showMessage(Msg: String) {
        Log.i(TAG,Msg)
        Toast.makeText(this,Msg,Toast.LENGTH_LONG).show()

        Snackbar.make(findViewById(R.id.first),Msg,Snackbar.LENGTH_LONG).show() }

    override fun onStart() {
        super.onStart()
        showMessage("on start is called") }

    override fun onResume() {
        super.onResume()
        showMessage("on resume is called") }

    override fun onPause() {
        super.onPause()
        showMessage("on pause is called")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onstop is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("on destroy is called")
    }

    }



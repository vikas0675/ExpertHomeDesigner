package com.example.experthomedesigner

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.experthomedesigner.databinding.ActivitySecondBinding
import com.example.experthomedesigner.databinding.HomedataRowResourceBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding2nd: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding2nd = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding2nd.root)









    }
}
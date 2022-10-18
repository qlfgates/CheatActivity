package com.bigneardranch.android.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CheatActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCheatingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cheat)

        binding = ActivityCheatBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
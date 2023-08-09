package com.tibesoft.listsfinanceoffline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tibesoft.listsfinanceoffline.databinding.ActivityMainBinding
import com.tibesoft.listsfinanceoffline.ui.ListFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().replace(
            R.id.frame_layout, ListFragment()
        ).commit()
    }
}
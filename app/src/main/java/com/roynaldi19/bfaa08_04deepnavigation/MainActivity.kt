package com.roynaldi19.bfaa08_04deepnavigation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.roynaldi19.bfaa08_04deepnavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOpenDetail.setOnClickListener(this)

        showNotification(this@MainActivity, getString(R.string.notification_title), getString(R.string.notification_message), 110)

    }

    override fun onClick(v: View) {
        if (v.id == R.id.btn_open_detail) {
            val detailIntent = Intent(this@MainActivity, DetailActivity::class.java)
            detailIntent.putExtra(DetailActivity.EXTRA_TITLE, getString(R.string.detail_title))
            detailIntent.putExtra(DetailActivity.EXTRA_MESSAGE, getString(R.string.detail_message))
            startActivity(detailIntent)
        }
    }

    private fun showNotification(context: Context, title: String, message: String, notifId: Int){

    }


}
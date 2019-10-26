package com.bh.ldp.myhuiapplication.test

import android.content.ComponentName
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.bh.ldp.myhuiapplication.R
import com.bh.ldp.myhuiapplication.caipu.CaiPuActivity
import com.bh.ldp.myhuiapplication.train.TrainQueryActivity
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
//        button.visibility = View.GONE
//        button.setOnClickListener {
//            val intent = Intent("ldp.example.com.android_demo.studydemo.broadcastReceiver2")
//            if (Build.VERSION.SDK_INT >= 26)
//            intent.component = ComponentName("ldp.example.com.android_demo.studydemo.views","ldp.example.com.android_demo.studydemo.views.MyBroadcastReceiver2")
//            sendBroadcast(intent)
//        }
        initView()
    }

    private fun initView() {
        cai_ay.setOnClickListener {
            startActivity(Intent(this, CaiPuActivity::class.java))
        }

        train_ay.setOnClickListener {
            startActivity(Intent(this, TrainQueryActivity::class.java))
        }
    }

}

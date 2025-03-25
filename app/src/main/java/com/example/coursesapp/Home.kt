package com.example.coursesapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
     lateinit var android :Button
    lateinit var ios :Button
    lateinit var fullStack :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)
        window.statusBarColor = ContextCompat.getColor(this, R.color.statusBar_color)
        initViews()
    }
    private fun initViews(){
        android=findViewById(R.id.android_btn)
        ios=findViewById(R.id.IOS_btn)
       fullStack=findViewById(R.id.fullStack_btn)
        android.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

                val intent = Intent(this@Home, AndroidContent::class.java)
                startActivity(intent)


            }
        })
       ios.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

                val intent = Intent(this@Home,IOSContent::class.java)
                startActivity(intent)


            }
        })
        fullStack.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

                val intent = Intent(this@Home, FullStackContent::class.java)
                startActivity(intent)


            }
        })

    }

}
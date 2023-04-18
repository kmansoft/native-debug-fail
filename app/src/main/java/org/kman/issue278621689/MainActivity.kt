package org.kman.issue278621689

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.kman.greeter.*;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloView: TextView = findViewById(R.id.hello_view)

        val greeter = Greeter();
        val message = greeter.message

        helloView.text = message
    }
}

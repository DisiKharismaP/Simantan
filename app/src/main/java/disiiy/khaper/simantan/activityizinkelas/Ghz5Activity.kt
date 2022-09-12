package disiiy.khaper.simantan.activityizinkelas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import disiiy.khaper.simantan.R
import disiiy.khaper.simantan.databinding.ActivityGhz5Binding

class Ghz5Activity : AppCompatActivity() {
    private lateinit var ghz5Binding: ActivityGhz5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ghz5Binding = ActivityGhz5Binding.inflate(layoutInflater)
        setContentView(ghz5Binding.root)
        supportActionBar?.hide()
    }
}
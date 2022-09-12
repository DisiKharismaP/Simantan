package disiiy.khaper.simantan.activitypenertiban

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import disiiy.khaper.simantan.R
import disiiy.khaper.simantan.databinding.ActivityPenangananBinding

class PenangananActivity : AppCompatActivity() {
    private lateinit var penangananBinding: ActivityPenangananBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        penangananBinding = ActivityPenangananBinding.inflate(layoutInflater)
        setContentView(penangananBinding.root)
        supportActionBar?.hide()
    }
}
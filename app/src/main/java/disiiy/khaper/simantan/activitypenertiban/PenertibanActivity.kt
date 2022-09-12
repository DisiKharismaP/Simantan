package disiiy.khaper.simantan.activitypenertiban

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import disiiy.khaper.simantan.R
import disiiy.khaper.simantan.databinding.ActivityPenertibanBinding

class PenertibanActivity : AppCompatActivity() {
    private lateinit var penertibanBinding: ActivityPenertibanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        penertibanBinding = ActivityPenertibanBinding.inflate(layoutInflater)
        setContentView(penertibanBinding.root)
        supportActionBar?.hide()
    }
}
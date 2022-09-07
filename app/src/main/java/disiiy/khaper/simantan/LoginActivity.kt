package disiiy.khaper.simantan

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    companion object{
        fun getLaunchService(from : Context)= Intent(from, LoginActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        btnLogin.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btnLogin -> startActivity(
                MainActivity.getLaunchService(this)
            )
        }
    }

}

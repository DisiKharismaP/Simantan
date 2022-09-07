package disiiy.khaper.simantan

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.etebarian.meowbottomnavigation.MeowBottomNavigation
import disiiy.khaper.simantan.databinding.ActivityMainBinding
import disiiy.khaper.simantan.fragment.IzinKelasFragment
import disiiy.khaper.simantan.fragment.MonitoringFragment
import disiiy.khaper.simantan.fragment.PenertibanFragment
import disiiy.khaper.simantan.fragment.SimsFragment


class MainActivity : AppCompatActivity() {
    private  lateinit var  mainBinding: ActivityMainBinding

    companion object{
        fun getLaunchService(from : Context)= Intent(from, MainActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        supportActionBar?.hide()

        addFragment(MonitoringFragment.newInstance())
        mainBinding.bottomNavigation.show(0)
        mainBinding.bottomNavigation.add(MeowBottomNavigation.Model(0, R.drawable.ic_monitoring))
        mainBinding.bottomNavigation.add(MeowBottomNavigation.Model(1, R.drawable.ic_penertiban))
        mainBinding.bottomNavigation.add(MeowBottomNavigation.Model(2, R.drawable.ic_izinkelas))
        mainBinding.bottomNavigation.add(MeowBottomNavigation.Model(3, R.drawable.ic_sims))
        mainBinding.bottomNavigation.setOnClickMenuListener {
            when(it.id) {
                0 -> {
                    replaceFragment(MonitoringFragment.newInstance())
                }
                1 -> {
                    replaceFragment(PenertibanFragment.newInstance()) //discovery
                }
                2 -> {
                    replaceFragment(IzinKelasFragment.newInstance())
                }
                3 -> {
                    replaceFragment(SimsFragment.newInstance())
                }
                else -> {
                    replaceFragment(MonitoringFragment.newInstance())
                }
            }
        }

    }

    private fun addFragment(fragment:Fragment) {
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.add(R.id.mainContainer,fragment).addToBackStack(Fragment::class.java.simpleName).commit()
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.add(R.id.mainContainer,fragment).addToBackStack(Fragment::class.java.simpleName).commit()
    }

}
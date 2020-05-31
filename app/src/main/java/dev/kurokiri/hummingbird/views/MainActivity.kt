package dev.kurokiri.hummingbird.views

import MenuListDialogFragment
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.kurokiri.hummingbird.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigation.setNavigationOnClickListener {
            val menuListDialogFragment = MenuListDialogFragment()
            menuListDialogFragment.show(supportFragmentManager, menuListDialogFragment.tag)
        }
    }
}
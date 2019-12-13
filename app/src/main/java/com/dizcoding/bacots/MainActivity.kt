package com.dizcoding.bacots

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.viewpager.widget.ViewPager
import com.dizcoding.bacots.adapter.ViewPagerAdapter
import com.dizcoding.bacots.fragment.CallFragment
import com.dizcoding.bacots.fragment.ChatFragment
import com.dizcoding.bacots.fragment.StatusFragment
import com.dizcoding.bacots.model.Fragments
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ViewPager.OnPageChangeListener {

    private var menuItem: Menu? = null
    private var activeTab : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val data = mutableListOf<Fragments>()
        data.add(Fragments("CHATS",ChatFragment()))
        data.add(Fragments("STATUS",StatusFragment()))
        data.add(Fragments("CALLS",CallFragment()))
        vpMenu.adapter = ViewPagerAdapter(supportFragmentManager,data)
        tlMenu.setupWithViewPager(vpMenu)
        vpMenu.addOnPageChangeListener(this)

    }
    /*Viewpager change*/
    override fun onPageScrollStateChanged(state: Int) {}
    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}
    override fun onPageSelected(position: Int) {loadMenuItem(position)}
    /*end of Viewpager change*/

    private fun loadMenuItem(position: Int){
        activeTab = position
        menuItem?.clear()
        when (position) {
            0 -> menuInflater.inflate(R.menu.coba,menuItem)
            1 -> menuInflater.inflate(R.menu.menu_status,menuItem)
            2 -> menuInflater.inflate(R.menu.menu_calls,menuItem)
        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuItem = menu
        loadMenuItem(activeTab)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.mnSetting -> {
                when(activeTab){
                    0 -> {}
                    1 -> {}
                    2 -> {}
                }
            }
        }

        return super.onOptionsItemSelected(item)
    }
}

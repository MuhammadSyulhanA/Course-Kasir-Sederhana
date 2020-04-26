package com.example.learnthreekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.learnthreekotlin.model.Hero
import com.example.learnthreekotlin.model.HeroesData
import com.example.learnthreekotlin.model.ListHeroAdapter

class MoveActivityOne2 : AppCompatActivity() {
    private lateinit var rvHeroes: RecyclerView
    private var list: ArrayList<Hero> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_one2)

        rvHeroes = findViewById(R.id.rv_heroes)
        rvHeroes.setHasFixedSize(true)

        list.addAll(HeroesData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvHeroes.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListHeroAdapter(list)
        rvHeroes.adapter = listHeroAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
            }
            R.id.action_grid -> {
            }
            R.id.action_cardview -> {
            }
        }
    }
}

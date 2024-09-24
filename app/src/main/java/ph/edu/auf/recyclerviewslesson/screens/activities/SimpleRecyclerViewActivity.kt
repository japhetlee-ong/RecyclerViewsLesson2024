package ph.edu.auf.recyclerviewslesson.screens.activities

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import ph.edu.auf.recyclerviewslesson.databinding.ActivitySimpleRecyclerViewBinding

class SimpleRecyclerViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySimpleRecyclerViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySimpleRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}
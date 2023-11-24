package com.hen.book.activity.detail

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.hen.book.R
import com.hen.data.domain.model.PlayerRemote
import com.hen.book.databinding.ActivityDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    @Suppress("DEPRECATION")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val book = intent.getParcelableExtra<PlayerRemote>("book") as PlayerRemote

        Glide.with(this)
            .load(book.photo)
            .into(binding.ivPlayer)

        binding.tvBookName.text = book.name
        binding.tvJenisBook.text = book.club
        binding.tvRating.text = book.rate.toString()
        binding.tvBookPenerbit.text = book.position
        binding.tvBookDescription.text = book.description

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }

        binding.btnSearchGoogle.setOnClickListener {
            val bookName = book.name

            val searchQuery = "https://www.google.com/search?q=${bookName}"

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(searchQuery))

            if (intent.resolveActivity(this.packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(this, getString(R.string.error_no_browser), Toast.LENGTH_SHORT).show()
            }
        }
    }
}
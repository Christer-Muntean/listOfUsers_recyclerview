package com.example.userdetails

import android.content.Context
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import java.net.URL


class MyAdapter(
    private val myDataset: List<User>,
    val userTileOnClickListener: UserTileOnClickListener, val context: Context
) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(val view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {

        val userTile = LayoutInflater.from(parent.context)
            .inflate(R.layout.user_tile, parent, false) as View

        return MyViewHolder(userTile)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val nameTextView = holder.view.findViewById<TextView>(R.id.name_textView)
        val userImageView = holder.view.findViewById<ImageView>(R.id.profile_image_imageView)

        nameTextView.text = myDataset[position].name

        Picasso.get().load(myDataset[position].profileImageUrl).into(userImageView);

        holder.view.setOnClickListener {
            userTileOnClickListener.onTileClicked(myDataset[position])
        }
    }

    override fun getItemCount() = myDataset.size
}
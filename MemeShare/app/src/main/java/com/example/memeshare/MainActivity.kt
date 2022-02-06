package com.example.memeshare

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var url1 : String? = null
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadMeme()
    }
    private fun  loadMeme(){
        pbMeme.visibility = View.VISIBLE

        val url = "https://meme-api.herokuapp.com/gimme"
        // Request a string response from the provided URL.
//    val stringRequest = StringRequest(Request.Method.GET, url,
//        { response ->
//            // Display the first 500 characters of the response string.
//            textView.text = "Response is: ${response.substring(0, 500)}"
//        },
//        { textView.text = "That didn't work!" })

        val jsonObjectRequest = JsonObjectRequest(Request.Method.GET, url, null,
            { response ->
                url1 = response.getString("url")
                Glide.with(this).load(url1).listener(object :RequestListener<Drawable>{
                    override fun onLoadFailed(
                        e: GlideException?,
                        model: Any?,
                        target: Target<Drawable>?,
                        isFirstResource: Boolean
                    ): Boolean {
                        pbMeme.visibility = View.VISIBLE
                        return false
                    }

                    override fun onResourceReady(
                        resource: Drawable?,
                        model: Any?,
                        target: Target<Drawable>?,
                        dataSource: DataSource?,
                        isFirstResource: Boolean
                    ): Boolean {
                        pbMeme.visibility = View.INVISIBLE
                        return false
                    }

                }).into(ivMeme)
            },
            { error ->
            }
        )
        // Add the request to the RequestQueue.
        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest)
    }
    fun ShareMeme(view: View) {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT,"Hey look at this coll meme ${url1}")
            startActivity(intent)
    }
    fun NextMeme(view: View) {
        loadMeme()
    }
}
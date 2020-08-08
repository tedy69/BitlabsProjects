package tech.riseofdevelopers.newsletter.activities

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_profile.*
import tech.riseofdevelopers.newsletter.R

class ProfileActivity : AppCompatActivity() {
    private var PRIVATE_MODE = 0
    private val PREF_NAME = "biltabs"
    var sharedPref : SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val image : ImageView = findViewById(R.id.img_profile)
        Glide.with(this).load("https://cdn.pixabay.com/photo/2017/06/13/12/53/profile-2398782_1280.png")
            .into(image)
        sharedPref = this.getSharedPreferences(PREF_NAME, PRIVATE_MODE)
        user_profile_name.setText(sharedPref!!.getString("user-name", ""))
        user_profile_email.setText(sharedPref!!.getString("user-email", ""))
    }
}
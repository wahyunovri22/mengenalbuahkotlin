package id.web.ods.app.aplikasibuah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        main()
    }

    fun main() {
        handler = Handler()
        handler.postDelayed({
            pindah()
        }, 3000)
    }

    fun pindah() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}
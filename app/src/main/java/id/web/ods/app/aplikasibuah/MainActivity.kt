package id.web.ods.app.aplikasibuah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        main()
    }

    fun main(){
        img_alpukat.setOnClickListener {
            menujuDetail("3")
        }

        img_ceri.setOnClickListener {
            menujuDetail("0")
        }

        img_jambu.setOnClickListener {
            menujuDetail("1")
        }
        img_strawberi.setOnClickListener {
            menujuDetail("2")
        }
    }

    fun menujuDetail(posisi:String){
        val i = Intent(this,DetailActivity::class.java)
        i.putExtra("posisi",posisi)
        startActivity(i)
    }


}
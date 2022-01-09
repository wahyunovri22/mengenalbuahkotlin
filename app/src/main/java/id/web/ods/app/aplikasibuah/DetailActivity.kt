package id.web.ods.app.aplikasibuah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.hide()
        main()
    }

    fun main(){
        val posisi = intent.getStringExtra("posisi") as String
        val data = InsertBuah().setDataBuah()
        for (i in 0 until data.size){
            if (data[i].id == posisi){
                tv_nama.text = data[i].nama
                tv_deskripsi.text = data[i].ket
                img_hasil.setImageResource(data[i].gambar)
                break
            }
        }

        img_back.setOnClickListener {
            onBackPressed()
        }
    }
}
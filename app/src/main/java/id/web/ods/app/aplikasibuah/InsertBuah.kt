package id.web.ods.app.aplikasibuah

import android.content.Context

class InsertBuah {

    fun setDataBuah():ArrayList<DataBuah>{
        val data = ArrayList<DataBuah> ()
        data.add(DataBuah("0","Ceri","Buah ceri lezat banyak mengandung vitamin",R.drawable.ceri))
        data.add(DataBuah("1","Jambu","Buah jambu lezat banyak mengandung vitamin",R.drawable.jambu))
        data.add(DataBuah("2","Strawberry","Buah strawberry lezat banyak mengandung vitamin",R.drawable.strawberry))
        data.add(DataBuah("3","Alpukat","Buah alpukat lezat banyak mengandung vitamin",R.drawable.alpukat))
        return data
    }

}
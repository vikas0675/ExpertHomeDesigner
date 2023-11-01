package com.example.experthomedesigner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.experthomedesigner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
     var arrInputDataItem = ArrayList<HomeDataModelClass>()
    lateinit var myRecyclerAdapterClass: RecyclerAdapterClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        arrInputDataItem.apply {

            add(HomeDataModelClass(R.drawable.homed1, "Duplex modern house Plot Area : 3600 sq.ft 45X80", "Expected Construction Cost : Rs. 40 to 52 Lack", R.drawable.whatsapp, R.drawable.star_border_purple500_24, R.drawable.send_24, "Total Plot Area : 3600 sq.ft", R.drawable.send_24, "Ground floor area : 1833 sq.ft", R.drawable.send_24, "First floor : 1110 sq.ft", R.drawable.send_24, "Total floor area : 2942 sq.ft", R.drawable.send_24, "Total 4 Bedroom & 4 Bathroom", R.drawable.send_24, "Ground Floor : sit out, Living, Dining, 2 Bedroom common Toilet, Moduler Kitchen ", R.drawable.send_24, "First Floor : Balcony-1, Upper Living, 2 Bedroom, Attached 2 Bathroom"))
            add(HomeDataModelClass(R.drawable.homed2, "Duplex modern house Plot Area : 3600 sq.ft 45X80", "Expected Construction Cost : Rs. 40 to 52 Lack", R.drawable.whatsapp, R.drawable.star_border_purple500_24, R.drawable.send_24, "Total Plot Area : 3600 sq.ft", R.drawable.send_24, "Ground floor area : 1833 sq.ft", R.drawable.send_24, "First floor : 1110 sq.ft", R.drawable.send_24, "Total floor area : 2942 sq.ft", R.drawable.send_24, "Total 4 Bedroom & 4 Bathroom", R.drawable.send_24, "Ground Floor : sit out, Living, Dining, 2 Bedroom common Toilet, Moduler Kitchen ", R.drawable.send_24, "First Floor : Balcony-1, Upper Living, 2 Bedroom, Attached 2 Bathroom"))
            add(HomeDataModelClass(R.drawable.homed3, "Duplex modern house Plot Area : 3600 sq.ft 45X80", "Expected Construction Cost : Rs. 40 to 52 Lack", R.drawable.whatsapp, R.drawable.star_border_purple500_24, R.drawable.send_24, "Total Plot Area : 3600 sq.ft", R.drawable.send_24, "Ground floor area : 1833 sq.ft", R.drawable.send_24, "First floor : 1110 sq.ft", R.drawable.send_24, "Total floor area : 2942 sq.ft", R.drawable.send_24, "Total 4 Bedroom & 4 Bathroom", R.drawable.send_24, "Ground Floor : sit out, Living, Dining, 2 Bedroom common Toilet, Moduler Kitchen ", R.drawable.send_24, "First Floor : Balcony-1, Upper Living, 2 Bedroom, Attached 2 Bathroom"))
            add(HomeDataModelClass(R.drawable.homed4, "Duplex modern house Plot Area : 3600 sq.ft 45X80", "Expected Construction Cost : Rs. 40 to 52 Lack", R.drawable.whatsapp, R.drawable.star_border_purple500_24, R.drawable.send_24, "Total Plot Area : 3600 sq.ft", R.drawable.send_24, "Ground floor area : 1833 sq.ft", R.drawable.send_24, "First floor : 1110 sq.ft", R.drawable.send_24, "Total floor area : 2942 sq.ft", R.drawable.send_24, "Total 4 Bedroom & 4 Bathroom", R.drawable.send_24, "Ground Floor : sit out, Living, Dining, 2 Bedroom common Toilet, Moduler Kitchen ", R.drawable.send_24, "First Floor : Balcony-1, Upper Living, 2 Bedroom, Attached 2 Bathroom"))
            add(HomeDataModelClass(R.drawable.homed5, "Duplex modern house Plot Area : 3600 sq.ft 45X80", "Expected Construction Cost : Rs. 40 to 52 Lack", R.drawable.whatsapp, R.drawable.star_border_purple500_24, R.drawable.send_24, "Total Plot Area : 3600 sq.ft", R.drawable.send_24, "Ground floor area : 1833 sq.ft", R.drawable.send_24, "First floor : 1110 sq.ft", R.drawable.send_24, "Total floor area : 2942 sq.ft", R.drawable.send_24, "Total 4 Bedroom & 4 Bathroom", R.drawable.send_24, "Ground Floor : sit out, Living, Dining, 2 Bedroom common Toilet, Moduler Kitchen ", R.drawable.send_24, "First Floor : Balcony-1, Upper Living, 2 Bedroom, Attached 2 Bathroom"))
            add(HomeDataModelClass(R.drawable.homed6, "Duplex modern house Plot Area : 3600 sq.ft 45X80", "Expected Construction Cost : Rs. 40 to 52 Lack", R.drawable.whatsapp, R.drawable.star_border_purple500_24, R.drawable.send_24, "Total Plot Area : 3600 sq.ft", R.drawable.send_24, "Ground floor area : 1833 sq.ft", R.drawable.send_24, "First floor : 1110 sq.ft", R.drawable.send_24, "Total floor area : 2942 sq.ft", R.drawable.send_24, "Total 4 Bedroom & 4 Bathroom", R.drawable.send_24, "Ground Floor : sit out, Living, Dining, 2 Bedroom common Toilet, Moduler Kitchen ", R.drawable.send_24, "First Floor : Balcony-1, Upper Living, 2 Bedroom, Attached 2 Bathroom"))
            add(HomeDataModelClass(R.drawable.homed7, "Duplex modern house Plot Area : 3600 sq.ft 45X80", "Expected Construction Cost : Rs. 40 to 52 Lack", R.drawable.whatsapp, R.drawable.star_border_purple500_24, R.drawable.send_24, "Total Plot Area : 3600 sq.ft", R.drawable.send_24, "Ground floor area : 1833 sq.ft", R.drawable.send_24, "First floor : 1110 sq.ft", R.drawable.send_24, "Total floor area : 2942 sq.ft", R.drawable.send_24, "Total 4 Bedroom & 4 Bathroom", R.drawable.send_24, "Ground Floor : sit out, Living, Dining, 2 Bedroom common Toilet, Moduler Kitchen ", R.drawable.send_24, "First Floor : Balcony-1, Upper Living, 2 Bedroom, Attached 2 Bathroom"))
            add(HomeDataModelClass(R.drawable.homed8, "Duplex modern house Plot Area : 3600 sq.ft 45X80", "Expected Construction Cost : Rs. 40 to 52 Lack", R.drawable.whatsapp, R.drawable.star_border_purple500_24, R.drawable.send_24, "Total Plot Area : 3600 sq.ft", R.drawable.send_24, "Ground floor area : 1833 sq.ft", R.drawable.send_24, "First floor : 1110 sq.ft", R.drawable.send_24, "Total floor area : 2942 sq.ft", R.drawable.send_24, "Total 4 Bedroom & 4 Bathroom", R.drawable.send_24, "Ground Floor : sit out, Living, Dining, 2 Bedroom common Toilet, Moduler Kitchen ", R.drawable.send_24, "First Floor : Balcony-1, Upper Living, 2 Bedroom, Attached 2 Bathroom"))
            add(HomeDataModelClass(R.drawable.homed9, "Duplex modern house Plot Area : 3600 sq.ft 45X80", "Expected Construction Cost : Rs. 40 to 52 Lack", R.drawable.whatsapp, R.drawable.star_border_purple500_24, R.drawable.send_24, "Total Plot Area : 3600 sq.ft", R.drawable.send_24, "Ground floor area : 1833 sq.ft", R.drawable.send_24, "First floor : 1110 sq.ft", R.drawable.send_24, "Total floor area : 2942 sq.ft", R.drawable.send_24, "Total 4 Bedroom & 4 Bathroom", R.drawable.send_24, "Ground Floor : sit out, Living, Dining, 2 Bedroom common Toilet, Moduler Kitchen ", R.drawable.send_24, "First Floor : Balcony-1, Upper Living, 2 Bedroom, Attached 2 Bathroom"))
            add(HomeDataModelClass(R.drawable.homed10, "Duplex modern house Plot Area : 3600 sq.ft 45X80", "Expected Construction Cost : Rs. 40 to 52 Lack", R.drawable.whatsapp, R.drawable.star_border_purple500_24, R.drawable.send_24, "Total Plot Area : 3600 sq.ft", R.drawable.send_24, "Ground floor area : 1833 sq.ft", R.drawable.send_24, "First floor : 1110 sq.ft", R.drawable.send_24, "Total floor area : 2942 sq.ft", R.drawable.send_24, "Total 4 Bedroom & 4 Bathroom", R.drawable.send_24, "Ground Floor : sit out, Living, Dining, 2 Bedroom common Toilet, Moduler Kitchen ", R.drawable.send_24, "First Floor : Balcony-1, Upper Living, 2 Bedroom, Attached 2 Bathroom"))

        }

        binding.recyclerViewID.layoutManager = LinearLayoutManager(this)
        myRecyclerAdapterClass = RecyclerAdapterClass(this, arrInputDataItem)
        binding.recyclerViewID.adapter = myRecyclerAdapterClass




    }
}
package com.example.experthomedesigner

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.experthomedesigner.databinding.ActivityMainBinding
import com.example.experthomedesigner.databinding.HomedataRowResourceBinding

  class RecyclerAdapterClass (val contextMy:Context, val arrDataList : ArrayList<HomeDataModelClass>) : RecyclerView.Adapter<RecyclerAdapterClass.MyViewHolderClass>(){


    class MyViewHolderClass ( val bindingHolderClass : HomedataRowResourceBinding ) : RecyclerView.ViewHolder(bindingHolderClass.root){


    }

      override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolderClass {
          return MyViewHolderClass(HomedataRowResourceBinding.inflate(LayoutInflater.from(contextMy),parent, false))
      }


      override fun getItemCount(): Int {
          return arrDataList.size
      }


      override fun onBindViewHolder(holder: MyViewHolderClass, position: Int) {
          holder.bindingHolderClass.imageHome.setImageResource(arrDataList[position].imgHomeModelClass)
          holder.bindingHolderClass.houseName.text = arrDataList[position].houseNameModelClass
          holder.bindingHolderClass.cost.text = arrDataList[position].costPriceModelClass
          holder.bindingHolderClass.btnWhatsp.setImageResource(arrDataList[position].imgWhatsappModelClass)
          holder.bindingHolderClass.btnStar.setImageResource(arrDataList[position].imgStarModelClass)

          holder.bindingHolderClass.imageViewA1.setImageResource(arrDataList[position].imgIcon1ModelClass)
          holder.bindingHolderClass.PA.text = arrDataList[position].PlotAreaModelClass

          holder.bindingHolderClass.imageViewA2.setImageResource(arrDataList[position].imgIcon2ModelClass)
          holder.bindingHolderClass.GFA.text = arrDataList[position].groundFloorGFAAreaModelClass

          holder.bindingHolderClass.imageViewA3.setImageResource(arrDataList[position].imgIcon3ModelClass)
          holder.bindingHolderClass.FFA.text = arrDataList[position].firstFloorFFAAreaModelClass

          holder.bindingHolderClass.imageViewA4.setImageResource(arrDataList[position].imgIcon4ModelClass)
          holder.bindingHolderClass.TotalFL.text = arrDataList[position].totalFloorAreaModelClass

          holder.bindingHolderClass.imageViewA5.setImageResource(arrDataList[position].imgIcon5ModelClass)
          holder.bindingHolderClass.BAB.text = arrDataList[position].bedroomAndBathroomBABModelClass

          holder.bindingHolderClass.imageViewA6.setImageResource(arrDataList[position].imgIcon6ModelClass)
          holder.bindingHolderClass.GFD.text = arrDataList[position].groundFlDetailsGFDModelClass

          holder.bindingHolderClass.imageViewA7.setImageResource(arrDataList[position].imgIcon7ModelClass)
          holder.bindingHolderClass.FFD.text = arrDataList[position].firstFlDetailsFFDModelClass





      }





  }
package com.example.agriculturainteligente.dialogs

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.DialogFragment

import com.example.agriculturainteligente.R

class DialogMilho : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val builder = AlertDialog.Builder(activity!!)
        builder.setTitle("Mais sobre o Milho")
        //builder.setIcon(R.drawable.cafe)
        builder.setMessage("O milho verde pode ser considerado uma hortaliça, em virtude do tempo de sua permanência no campo até o momento\n" +
                "da colheita, que é curto de aproximadamente 90 dias no verão e de 100 dias no inverno. A cultura tornou-se uma opção\n" +
                "de grande valor econômico, principalmente para os produtores que utilizam mão de obra familiar, graças ao bom preço\n" +
                "de mercado, à significativa demanda pelo produto in natura e pela crescente procura pelo produto por parte da indústria\n" +
                "de conservas alimentícias. O mercado de milho verde é tão promissor e lucrativo que as empresas de sementes\n" +
                "entraram no negócio lançando algumas cultivares específicas.\n")

            .setPositiveButton("OK", DialogInterface.OnClickListener { dialog, id ->

                Toast.makeText(activity, getString(R.string.good), Toast.LENGTH_SHORT).show()

            })


        return builder.create()

    }
}
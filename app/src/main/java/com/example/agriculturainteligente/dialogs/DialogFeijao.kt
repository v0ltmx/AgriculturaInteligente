package com.example.agriculturainteligente.dialogs

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.DialogFragment

import com.example.agriculturainteligente.R

class DialogFeijao : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val builder = AlertDialog.Builder(activity!!)
        builder.setTitle("Mais sobre o Feijão")
        //builder.setIcon(R.drawable.feijao) //Relembrar de adicionar a imagem no drawble
        builder.setMessage("No Brasil, o feijão de corda pode ter vários nomes, dependendo da região, sendo também conhecido por feijão\n" +
                "caupi, macaçar ou fradinho. Apesar de ser um alimento tipicamente brasileiro, o feijão de corda é originário da África.\n" +
                "Em função da sua ampla adaptabilidade e plasticidade, bem como o seu alto conteúdo proteico, o feijão de\n" +
                "corda está distribuído pelo mundo todo. Está cultura caracteriza-se por ser uma planta anual, podendo atingir até 3\n" +
                "metros de altura.\n" +
                "Como vantagem para os agricultores, o feijão de corda possui ciclo curto, menor exigência hídrica, além de\n" +
                "elevada rusticidade. Fatores que permitem a este grão ser cultivado em solos de baixa fertilidade.Por isso, é uma ótima\n" +
                "opção para a melhoria da qualidade de vida, especialmente da população carente, seja no meio rural ou urbano.")

            .setPositiveButton("OK", DialogInterface.OnClickListener { dialog, id ->
                Toast.makeText(activity, getString(R.string.good), Toast.LENGTH_SHORT).show()
            })
        return builder.create()
    }
}
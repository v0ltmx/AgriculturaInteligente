package com.example.agriculturainteligente.dialogs

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.DialogFragment

import com.example.agriculturainteligente.R

class DialogMandioca : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val builder = AlertDialog.Builder(activity!!)
        builder.setTitle("Mais sobre a Mandioca")
        //builder.setIcon(R.drawable.Mandioca) // lembrar de adicionar a imagem no drawble
        builder.setMessage("Originária de região tropical, a mandioca encontra condições favoráveis para o seu desenvolvimento em todos\n" +
                "os climas tropicais e subtropicais.\n" +
                "A faixa ideal de temperatura situa-se entre os limites de 20 a 27oC (média anual), podendo a planta crescer\n" +
                "bem entre 16 e 38oC. As temperaturas baixas, em torno de 15oC retardam a germinação e diminuem ou mesmo\n" +
                "paralisam sua atividade vegetativa, entrando em fase de repouso.\n" +
                "A faixa mais adequada de chuva está compreendida entre 1.000 a 1.500 mm/ano, bem distribuídos. é\n" +
                "importante que exista uma drenagem adequada, pois o encharcamento favorece a podridão de raízes. É também muito\n" +
                "cultivada em regiões semi-áridas, com 500 a 700 mm de chuva por ano ou menos; nessas condições, é importante\n" +
                "adequar a época de plantio, para que não ocorra deficiência de água nos primeiros cinco meses de cultivo (período de\n" +
                "estabelecimento da cultura), o que prejudica a produção.")

            .setPositiveButton("OK", DialogInterface.OnClickListener { dialog, id ->
                Toast.makeText(activity, getString(R.string.good), Toast.LENGTH_SHORT).show()
            })
        return builder.create()
    }
}
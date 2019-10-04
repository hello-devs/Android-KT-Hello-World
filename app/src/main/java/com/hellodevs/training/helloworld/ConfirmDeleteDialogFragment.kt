package com.hellodevs.training.helloworld

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.DialogFragment

class ConfirmDeleteDialogFragment : DialogFragment() {

    val TAG = ConfirmDeleteDialogFragment::class.java.simpleName

    interface ConfirmDeleteListener {
        fun onDialogPositiveClick()

        fun onDialogNegativeClick()
    }

    var listener: ConfirmDeleteListener? = null

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)

        builder.setMessage("Confirmer la suppression ?")
            .setPositiveButton("Confirmer", object: DialogInterface.OnClickListener{
                override fun onClick(dialog: DialogInterface?, id: Int) {
                    Log.i(TAG, "Tout va etre supprimé")
                    listener?.onDialogPositiveClick()
                }

            })
            .setNegativeButton("Surtout pas !", DialogInterface.OnClickListener { dialog, id ->
                Log.i(TAG,"Ce sera pour la prochaine fois")
                listener?.onDialogNegativeClick()

            })


        return builder.create()
    }

}
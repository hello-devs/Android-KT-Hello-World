package com.hellodevs.training.helloworld


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

//ANDROID OS: OptionMenu
class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    /* Afficher le menu*/
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)     //inflater transform le fichier xml en code
        return true //indique que l'activité contient un menu et qu'il faut l'afficher
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_add -> {
                Toast.makeText(this, "Ajouter", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_save -> {
                Toast.makeText(this, "Sauvegarder", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_delete -> {
                Toast.makeText(this, "Supprimer", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_help -> {
                Toast.makeText(this, "Aide", Toast.LENGTH_SHORT).show()
                return true
            }

            else -> return super.onOptionsItemSelected(item)
        }
    }
}


package com.hellodevs.training.helloworld


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


//ANDROID OS: RecyclerView 2/2
class MainActivity : AppCompatActivity(), View.OnClickListener {

    var countries = arrayOf<String>("Afghanistan","Albania","Algeria","Andorra","Angola",
        "Anguilla","Antigua & Barbuda","Argentina","Armenia","Aruba","Australia","Austria",
        "Azerbaijan","Bahamas","Bahrain","Bangladesh","Barbados","Belarus","Belgium","Belize",
        "Benin","Bermuda","Bhutan","Bolivia","Bosnia &amp; Herzegovina","Botswana","Brazil",
        "British Virgin Islands","Brunei","Bulgaria","Burkina Faso","Burundi","Cambodia","Cameroon",
        "Cape Verde","Cayman Islands","Chad","Chile","China","Colombia","Congo","Cook Islands",
        "Costa Rica","Cote D Ivoire","Croatia","Cruise Ship","Cuba","Cyprus","Czech Republic",
        "Denmark","Djibouti","Dominica","Dominican Republic", "Ecuador","Egypt","El Salvador",
        "Equatorial Guinea","Estonia","Ethiopia","Falkland Islands","Faroe Islands","Fiji","Finland",
        "France","French Polynesia","French West Indies","Gabon","Gambia","Georgia","Germany",
        "Ghana","Gibraltar","Greece","Greenland", "Grenada","Guam","Guatemala","Guernsey","Guinea",
        "Guinea Bissau","Guyana","Haiti","Honduras","Hong Kong","Hungary","Iceland",
        "India","Indonesia","Iran","Iraq","Ireland","Isle of Man","Israel","Italy","Jamaica",
        "Japan","Jersey","Jordan","Kazakhstan", "Kenya","Kuwait","Kyrgyz Republic","Laos","Latvia",
        "Lebanon","Lesotho","Liberia","Libya","Liechtenstein","Lithuania","Luxembourg","Macau",
        "Macedonia","Madagascar","Malawi","Malaysia","Maldives","Mali","Malta","Mauritania",
        "Mauritius","Mexico","Moldova","Monaco", "Mongolia","Montenegro","Montserrat","Morocco",
        "Mozambique","Namibia","Nepal","Netherlands","Netherlands Antilles","New Caledonia",
        "New Zealand","Nicaragua","Niger","Nigeria","Norway","Oman","Pakistan","Palestine",
        "Panama","Papua New Guinea","Paraguay","Peru","Philippines","Poland","Portugal",
        "Puerto Rico","Qatar","Reunion","Romania","Russia","Rwanda","Saint Pierre & Miquelon",
        "Samoa","San Marino","Satellite","Saudi Arabia","Senegal","Serbia","Seychelles","Sierra Leone",
        "Singapore","Slovakia","Slovenia","South Africa", "South Korea","Spain","Sri Lanka",
        "St Kitts & Nevis", "St Lucia","St Vincent","St. Lucia","Sudan","Suriname","Swaziland",
        "Sweden", "Switzerland","Syria","Taiwan","Tajikistan","Tanzania","Thailand","Timor L'Este",
        "Togo","Tonga","Trinidad &amp; Tobago","Tunisia","Turkey", "Turkmenistan","Turks & Caicos",
        "Uganda","Ukraine","United Arab Emirates","United Kingdom","Uruguay","Uzbekistan","Venezuela",
        "Vietnam","Virgin Islands (US)","Yemen","Zambia","Zimbabwe")

    val TAG = "MainActivity"

    val adapter = CountryAdapter(countries, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countries_recycler_view.layoutManager = LinearLayoutManager(this)
        countries_recycler_view.adapter = adapter

        update_countries_btn.setOnClickListener {
            updateCountries()
        }
    }

    override fun onClick(view: View) {
        if (view.tag != null){
            val index= view.tag as Int
            val country = countries[index]
            Toast.makeText(this, "Le pays sélectionné est $country", Toast.LENGTH_SHORT).show()
        }
    }

    fun updateCountries() {
        val lastLetter = countries[0].last()

        for ((index,country) in countries.withIndex()){
            if(lastLetter.isUpperCase()){
                countries[index] = country.toLowerCase().capitalize()
            }else{
                countries[index] = country.toUpperCase()
            }
        }

        adapter.notifyDataSetChanged()
    }
}


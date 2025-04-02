package vcmsa.ci.imadass1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale


class TimeofActivity : AppCompatActivity() {

    var timeofday: EditText? = null
    var clearbutton: Button? = null
    var confirmbutton : Button? = null
    var result : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_timeof)

        timeofday = findViewById<View>(R.id.timeofday) as EditText
        confirmbutton = findViewById<View>(R.id.confirmbutton) as Button
        clearbutton = findViewById<View>(R.id.clearbutton) as Button
        result = findViewById<View>(R.id.result) as TextView

        // Button click listener to validate input
        confirmbutton!!.setOnClickListener() {
            val timeofday = timeofday!!.text.toString()
            val mealtype:String

            if (timeofday == "morning") {
                mealtype = "Try a healthy breakfast: Oatmeal, eggs, or a smoothie!"
            }

            else if (timeofday == "mid-morning") {
                mealtype = "How about a light snack? Maybe some yogurt and fruits."
            }

            else if (timeofday == "mid-day"){
                mealtype = "Lunchtime! Consider a balanced meal with proteins and veggies."
            }

            else if (timeofday == "afternoon"){
                mealtype = "Feeling snacky? Nuts or a granola bar might be good!"
            }

            else if (timeofday == "mid-afternoon" ) {
                mealtype = "Tea time? A sandwich or some crackers would be great."
            }

            else if (timeofday == "evening"){
                mealtype = "Dinner ideas: Grilled chicken, salad, or pasta."
            }

            else if (timeofday == "night"){
                mealtype = "A light meal before bed? Try herbal tea with some nuts."
            }
            else{

                mealtype = "Invalid input"
            }
            result!!.text = "$mealtype"


        }


                    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                        val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                        v.setPadding(
                            systemBars.left,
                            systemBars.top,
                            systemBars.right,
                            systemBars.bottom
                        )
                        insets
                    }

                }
            }

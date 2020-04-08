package kun.hee.sign_in_solve_practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_name.*

class EditNameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_name)

        nameOkBtn.setOnClickListener {

            val inputName = nameEdt.text.toString()

            val myIntent = Intent(this, MyPageActivity::class.java)
            //데이터가져와라아아
            myIntent.putExtra("userName",inputName)
            startActivity(myIntent)
        }
    }
}

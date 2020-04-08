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
            val inputBirthYear = birthYear.text.toString().toInt() // 자료형 변환이 쉬워용

            val myIntent = Intent(this, MyPageActivity::class.java)
            //데이터가져와라아아

            myIntent.putExtra("userName",inputName)
            myIntent.putExtra("userAge",2020-inputBirthYear+1) //실제나이나오게끔 계산. - intenger로 담긴다.

            startActivity(myIntent)
        }
    }
}

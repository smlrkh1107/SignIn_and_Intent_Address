package kun.hee.sign_in_solve_practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_adress.*
import kotlinx.android.synthetic.main.activity_edit_name.*

class EditNameActivity : AppCompatActivity() {

    // 이 1000이라는 숫자는, 주소를 얻기위한 요청이라고 하는 메모.
    val REQ_FOR_ADDRESS = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_name)


        detailAddressBtn.setOnClickListener {
            val myIntent = Intent(this, EditAdressActivity::class.java)
            startActivityForResult(myIntent, REQ_FOR_ADDRESS)
            //결과받는거
            //requestCode 에 바로 숫자를 넣으면 뭘 의미하는지 잊기 딱좋지?
            // 그래서 class 아래에 변수 지정

        }





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

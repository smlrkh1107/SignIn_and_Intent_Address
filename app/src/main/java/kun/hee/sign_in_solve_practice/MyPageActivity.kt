package kun.hee.sign_in_solve_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_page.*

class MyPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_page)

        val name = intent.getStringExtra("userName") //보낼때 정한 이름
        userNameText.text = name


    }
}

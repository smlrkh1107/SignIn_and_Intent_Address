package kun.hee.sign_in_solve_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_page.*

class MyPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_page)

        val name = intent.getStringExtra("userName") //보낼때 정한 이름
//        userNameText.text = name + "님 안녕하세요"

        val age = intent.getIntExtra("userAge", 0)
        // ★★intenger는 값을 받아오지 않으면 Default를 꼭 ★ 정해줘야 해, string은 null들어가
        userNameText.text = "${name}  ${age}"


    }
}

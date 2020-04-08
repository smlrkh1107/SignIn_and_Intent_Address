package kun.hee.sign_in_solve_practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //다음버튼이름이지지
       nextBtn.setOnClickListener {
            //MyPageActivity로 이동시켜주고 싶꾸나

           //다음버튼 누르면 인텐트로~~ 여기서부터 class자바
           val myIntent = Intent(this, MyPageActivity::class.java)
           startActivity(myIntent)
        }

    }
}

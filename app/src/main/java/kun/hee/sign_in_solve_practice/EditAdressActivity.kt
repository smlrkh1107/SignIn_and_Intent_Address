package kun.hee.sign_in_solve_practice

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_adress.*
import kotlinx.android.synthetic.main.activity_edit_name.*

class EditAdressActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_adress)

        detailAddressBtn.setOnClickListener {
            //입력을 제대로 완료하겠다. ==> 돌아가는 길에 데이터 첨부.
            //데이터첨부전용 Intent 생성 ==> 출발지/목적지 적지 않아.

            val resultIntent = Intent()
            resultIntent.putExtra("mainAddress", mainAddressEdt.text.toString())
            //출발이아닌 목적지 x 왕복행이야.
            resultIntent.putExtra("detailAddress", detailAddressEdt.text.toString())

            setResult(Activity.RESULT_OK, resultIntent)
            //완료버튼을 눌렀다는 뜻 ==>  resultIntent 없어도돌아가긴하눈ㄷ,,
            //취소가디폴트니, RESULT_OK해야 확인인것


            //결과 세팅이 끝났으니 화면 종료
            finish()
        }

    }
}

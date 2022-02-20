package kr.co.smartsoft.kotlingrammaruitest_20220215

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOk.setOnClickListener {
            val sId = edtId.text.toString()
            val sPass = edtPassword.text.toString()

            if (sId == "admin" && sPass == "asdf") {
                Toast.makeText(this, "관리자님 환영합니다.", Toast.LENGTH_SHORT).show()
            } else if (sId != "admin") {
                Toast.makeText(this, "아이디가 잘못되었습니다.", Toast.LENGTH_SHORT).show()
            } else if (sPass != "asdf") {
                Toast.makeText(this, "패스워드가 잘못되었습니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
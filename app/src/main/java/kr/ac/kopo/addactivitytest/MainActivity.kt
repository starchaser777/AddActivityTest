package kr.ac.kopo.addactivitytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rg = findViewById<RadioGroup>(R.id.rg)
        rg.check(R.id.radioSecond)
        var btnMain = findViewById<Button>(R.id.btnMain)
        var intent = Intent(this@MainActivity, SecondActivity::class.java)
        rg.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId) {
                R.id.radioSecond -> intent = Intent(applicationContext, SecondActivity::class.java)
                R.id.radioThird -> intent = Intent(applicationContext, ThirdActivity::class.java)
            }
        }
        btnMain.setOnClickListener {
            startActivity(intent)
        }



//        var btnMain = findViewById<Button>(R.id.btnMain)
//        btnMain.setOnClickListener {
//            var intent = Intent(applicationContext, SecondActivity::class.java)
//            startActivity(intent) // 액티비티를 시작시켜서 SecondActivity를 실행.
//        }
    }
}
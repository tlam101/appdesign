package watch.ai.appdesign

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val confirm = findViewById<Button>(R.id.ConfirmButton);
        confirm.setOnClickListener {
            val Intent = Intent(this, NewActivity1::class.java)
            startActivity(Intent)
            Toast.makeText(this, "hello", Toast.LENGTH_LONG).show();
        }

    }


}
package cr.ac.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val expression = Expression("2+2")
        println("****************************" + expression.calculate())
    }
}
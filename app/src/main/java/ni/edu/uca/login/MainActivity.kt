package ni.edu.uca.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ni.edu.uca.login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val user = "Leo"
    private val pw = "sus"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Start()
    }
    fun Start(){
        binding.btnLogin.setOnClickListener {
            val usuario = binding.etUser.text.toString()
            val contra = binding.etPassword.text.toString()
            validar(usuario,contra)
        }
    }

    fun validar(user: String, pw:String){
        if(user.equals(this.user) && pw.equals(this.pw)){
            Toast.makeText(this, "Welcome ${this.user}", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this, "User is not available", Toast.LENGTH_SHORT).show()
        }
    }

}
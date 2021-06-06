package br.com.bancomr

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.bancomr.databinding.ActivityMainBinding
import br.com.bancomr.databinding.ActivitySaldoBinding

class SaldoActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySaldoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySaldoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val toolbar = binding.toolbarSaldo
        toolbar.title = "Saldo Banco MR"
        toolbar.setBackgroundColor(getColor(R.color.blue))
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_return))
        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            toolbar.setTitleMargin(130,0,0,0)
        }
    }
}
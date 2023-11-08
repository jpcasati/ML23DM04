package br.edu.mouralacerda.ml23dm04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import br.edu.mouralacerda.ml23dm04.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val bind by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bind.root)

        bind.janela.settings.javaScriptEnabled = true
        bind.janela.webViewClient = WebViewClient()

        val url = "https://www.google.com"

        bind.janela.loadUrl(url)
    }

}
package fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.week6_wangchhu.R

class aBOUT : Fragment() {
    private lateinit var wbView: WebView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =inflater.inflate(R.layout.fragment_a_b_o_u_t, container, false)
        wbView= view.findViewById(R.id.wbView)
        wbView.loadUrl("https://softwarica.edu.np/")

        val WebSettings = wbView.getSettings();
        WebSettings.setJavaScriptEnabled(true)

        wbView.setWebViewClient(WebViewClient())



        return view

    }






}
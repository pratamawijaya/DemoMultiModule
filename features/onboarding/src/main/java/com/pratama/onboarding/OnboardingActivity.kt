package com.pratama.onboarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_onboarding.*

class OnboardingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        btnRegister.setOnClickListener {
            startActivity(Navigations.openRegister(this))
        }

        btnLogin.setOnClickListener {
            startActivity(Navigations.openLogin(this))
        }
    }
}

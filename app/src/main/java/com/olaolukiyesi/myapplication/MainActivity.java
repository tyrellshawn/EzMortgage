package com.olaolukiyesi.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
 TextInputLayout mPrincipalLayout;
 TextInputLayout mNumberofYearsLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPrincipalLayout = findViewById(R.id.txtPrincipal_layout);
        mNumberofYearsLayout = findViewById(R.id.txtYears_layout);

        mPrincipalLayout.setEndIconOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //new MaterialAlertDialogBuilder(getApplicationContext(),R.style.ThemeOverlay_MaterialComponents_MaterialAlertDialog).setTitle("Principal").setMessage("The amount due minus the down Payment.").setPositiveButton("Ok",null).show();
            }
        });
    }
}

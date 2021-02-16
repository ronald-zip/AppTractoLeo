package com.ronald.apptractoleo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectOptionUser extends AppCompatActivity implements View.OnClickListener{

    CardView crdvAddProds, crdvQueryProds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_option_user);

        crdvAddProds = findViewById(R.id.cardAddProds);
        crdvQueryProds = findViewById(R.id.cardQueryProds);

        crdvAddProds.setOnClickListener(this);
        crdvQueryProds.setOnClickListener(this);
    }

    @Override
    public void onClick (View view)
    {
        switch (view.getId())
        {
            case R.id.cardAddProds:
                Intent intAddProds = new Intent(SelectOptionUser.this, CreateNewProduct.class);
                startActivity(intAddProds);
                break;

            case R.id.cardQueryProds:
                Intent intQueryProds = new Intent(SelectOptionUser.this, SearchProductUser.class);
                startActivity(intQueryProds);
                break;
        }
    }
}
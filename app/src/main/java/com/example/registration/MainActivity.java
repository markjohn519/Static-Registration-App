package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.registration.MESSAGE";
    public EditText UserName,UserEmail,UserPass1,UserPass2;
    Button SignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserName=findViewById(R.id.tfUser);
        UserEmail=findViewById(R.id.tfEmail);
        UserPass1=findViewById(R.id.tfPass1);
        UserPass2=findViewById(R.id.tfPass2);
        SignUp=findViewById(R.id.button);
        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = UserName.getText().toString();
                String email = UserEmail.getText().toString();
                String pass1 = UserPass1.getText().toString();
                String pass2 = UserPass2.getText().toString();
                if (user.isEmpty() || email.isEmpty() || pass1.isEmpty() || pass2.isEmpty()){
                    Toast.makeText(MainActivity.this,"Pleas fill all fields",Toast.LENGTH_SHORT).show();
                }
                else if(!pass1.equals(pass2)){
                    Toast.makeText(MainActivity.this,"Password does not match.",Toast.LENGTH_SHORT).show();
                }
                else{
                    openHome();
                }
            }
        });
    }
    private void openHome() {
        Intent intent = new Intent(this, home.class);
        String user = UserName.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, user);
        startActivity(intent);
    }
}
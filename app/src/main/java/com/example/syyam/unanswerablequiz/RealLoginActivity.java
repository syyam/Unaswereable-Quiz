package com.example.syyam.unanswerablequiz;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RealLoginActivity extends AppCompatActivity implements View.OnClickListener{

    private Button buttonSignIn;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private TextView textViewSignup;
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_login);
        editTextEmail=(EditText) findViewById(R.id.editTextEmail);
        editTextPassword=(EditText) findViewById(R.id.editTextPassword);
        buttonSignIn=(Button) findViewById(R.id.buttonSignin);
        textViewSignup=(TextView) findViewById(R.id.textViewSignup);
        progressDialog=new ProgressDialog(this);
        buttonSignIn.setOnClickListener(this);
        textViewSignup.setOnClickListener(this);
        firebaseAuth =FirebaseAuth.getInstance();

        if (firebaseAuth.getCurrentUser()!=null)
        {
            finish();
            startActivity(new Intent(getApplicationContext(),termsConditions.class));
        }
    }
    private void userLogin()
    {
        String email=editTextEmail.getText().toString().trim();
        String password=editTextPassword.getText().toString().trim();
        if (TextUtils.isEmpty(email))
        {
            Toast.makeText(this,"You are supposed to write your email -_-",Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(password))
        {
            Toast.makeText(this,"Password please?",Toast.LENGTH_SHORT).show();
            return;
        }
        progressDialog.setMessage("Logging In");
        progressDialog.show();
        firebaseAuth.signInWithEmailAndPassword(email,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();
                        if (task.isSuccessful())
                        {
                            Toast.makeText(RealLoginActivity.this,"You are now logged in",Toast.LENGTH_SHORT).show();
                            progressDialog.hide();
                            finish();
                            startActivity(new Intent(getApplicationContext(),termsConditions.class));
                        }
                        else
                        {
                            Toast.makeText(RealLoginActivity.this,"Process Failed",Toast.LENGTH_SHORT).show();
                            progressDialog.hide();
                        }
                    }
                });
    }
    @Override
    public void onClick(View view) {
        if (view ==buttonSignIn)
        {
            userLogin();
        }
        if (view ==textViewSignup)
        {
            finish();
            startActivity(new Intent(this, LoginActivity.class));
        }
    }
}

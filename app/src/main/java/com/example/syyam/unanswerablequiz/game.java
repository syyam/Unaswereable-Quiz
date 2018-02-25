package com.example.syyam.unanswerablequiz;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class game extends AppCompatActivity implements View.OnClickListener {

    private Button logout;
    private Button exit;
    private Button hint1;
    private Button hint2;
    private Button hint3;
    private TextView question;
    private TextView first;
    private TextView second;
    private TextView third;
    private TextView fourth;
    private FirebaseAuth firebaseAuth;
    int score=0;
    int quest=1;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        /*firebaseAuth = FirebaseAuth.getInstance();
        if (firebaseAuth.getCurrentUser()==null)
        {
            finish();
            startActivity(new Intent(this,RealLoginActivity.class));
        }*/
        logout = (Button) findViewById(R.id.logout);
        exit = (Button) findViewById(R.id.exit);
        hint1 = (Button) findViewById(R.id.hint1);
        hint2 = (Button) findViewById(R.id.hint2);
        hint3 = (Button) findViewById(R.id.hint3);
        question = (TextView) findViewById(R.id.question);
        first = (TextView) findViewById(R.id.first);
        second = (TextView) findViewById(R.id.second);
        third = (TextView) findViewById(R.id.third);
        fourth = (TextView) findViewById(R.id.fourth);
        quiz();

        }
    public void quiz()
    {
        if(quest==1)//4
        {


            question.setText("In Matric, What grade did Gandhi score in Pak Studies");
            first.setText("A) HAHAHAHAHAHAH");
            second.setText("B) A");
            third.setText("C)  AHAHAHA");
            fourth.setText("D)  LOL");
            fourth.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quest=quest+1;
                    quiz();
                }

            });

        }
        if(quest==2)//2
        {


            question.setText("What's the 8th letter of an alphabet?");
            first.setText("A)  G");
            second.setText("B)  T");
            third.setText("C)  H");
            fourth.setText("D)  I");
            second.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quest=quest+1;
                    quiz();
                }
            });

        }
        if(quest==3)//3
        {

            question.setText("How many ducks can there be in a river?");
            first.setText("A)  Many");
            second.setText("B)  So Many");
            third.setText("C)  Less");
            fourth.setText("D)  Much lesser than option C");
            third.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quest=quest+1;
                    quiz();
                }
            });

        }
        if(quest==4)//3
        {

            question.setText("How are you finding this game?");
            first.setText("A)  Not Bad");
            second.setText("B)  Best game ever");
            third.setText("C)  It's extremely bad");
            fourth.setText("D)  :D ");
            third.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quest=quest+1;
                    quiz();
                }
            });

        }
        if(quest==5)//4
        {

            question.setText("Is it illegal to kill an ant?");
            first.setText("A)  Ofcourse not! They are also human");
            second.setText("B)  Yes it's because... why not? ");
            third.setText("C)  Triangle");
            fourth.setText("D)  I am an ant, I dont know");
            fourth.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    quest=quest+1;
                    quiz();
                }
            });

        }
        if(quest==6)//question
        {

            question.setText("Red?");
            first.setTextColor(Color.parseColor("#FFFFFF"));
            first.setText("A)  Me");
            second.setText("B)  Red");
            third.setBackgroundColor(0xfff00000);
            third.setText("C)  Click me plzz");
            fourth.setText("D)  Enjoying the game?");
            question.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quest=quest+1;
                    quiz();
                }
            });

        }
        if(quest==7)//1
        {

            question.setText("Why?");
            first.setText("A)  Because");
            second.setText("B)  Thy");
            third.setText("C)  Hy");
            fourth.setText("D)  BRAZIL");
            first.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quest=quest+1;
                    quiz();
                }
            });

        }
        if(quest==8)//4
        {

            question.setText("What animal is Doremon?");
            first.setText("A)  Sonic the hedghog");
            second.setText("B)  Human");
            third.setText("C)  A blue goat");
            fourth.setText("D)  Harambe");
            fourth.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quest=quest+1;
                    quiz();
                }
            });

        }
        if(quest==9)//4
        {

            question.setText("What is the cheapest yet tastiest thing to eat?");
            first.setText("A)  ANDAY WALA BURGER");
            second.setText("B)  Grass");
            third.setText("C)  AALU GULEHRI");
            fourth.setText("D)  Chicken juice");
            fourth.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quest=quest+1;
                    quiz();
                }
            });

        }
        if(quest==10)//1
        {

            question.setText("1+1=?");
            first.setText("A)  B is the right option");
            second.setText("B)  D is the right option");
            third.setText("C)  K is the rigt option");
            fourth.setText("D)  C is the right option");
            first.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    quest=quest+1;
                    quiz();
                }
            });

        }
        if(quest==11)//4
        {

            question.setText("What is the color of a crow?");
            first.setText("A)  Indigo");
            second.setText("B)  Transparent");
            third.setText("C)  kawn kawn");
            fourth.setText("D)  Nigerian");
            fourth.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quest=quest+1;
                    quiz();
                }
            });

        }
        if(quest==12)//3
        {

            question.setText("Can a man walk on sun?");
            first.setText("A)  No, because it is too hot");
            second.setText("B)  Yes, but that will be his last walk");
            third.setText("C)  No, but a sun can walk on man");
            fourth.setText("D)  Man can walk on son");
            third.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quest=quest+1;
                    quiz();
                }
            });

        }
        if(quest==13)//4
        {

            question.setText("Hy?");
            first.setText("A)  Low");
            second.setText("B)  Hello");
            third.setText("C)  Monday");
            fourth.setText("D)  Shit");
            fourth.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quest=quest+1;
                    quiz();
                }
            });

        }
        if(quest==14)//2
        {

            question.setText("Which German-born scientist invented the first modern thermometer?");
            first.setText("A)  JOSRPH CELSIUS");
            second.setText("B)  GABRIEL FAHRENHEIT");
            third.setText("C)  ADAM DEGREES");
            fourth.setText("D)  GRAHAM THARMA");
            second.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quest=quest+1;
                    quiz();
                }
            });

        }
        if(quest==15)//3
        {

            question.setText("I like to?");
            first.setText("A)  Play games");
            second.setText("B)  Eat my cat");
            third.setText("C)  Drop newly born babies");
            fourth.setText("D)  Move it");
            third.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quest=quest+1;
                    quiz();
                }
            });

        }
    }



    @Override
    public void onClick(View view) {
        if (view==logout)
        {
            //firebaseAuth.signOut();
            finish();
            startActivity(new Intent(this,RealLoginActivity.class));
        }
        if (view==hint1)
        {
            quest=quest+1;
            hint1.setBackgroundColor(0x154504);
            hint1.setEnabled(false);
        }
        if (view==hint2)
        {
            quest=quest+1;
            hint1.setBackgroundColor(0x154504);
            hint1.setEnabled(false);
        }
        if (view==hint1)
        {
            quest=quest+1;
            hint1.setBackgroundColor(0x154504);
            hint1.setEnabled(false);
        }
    }
}

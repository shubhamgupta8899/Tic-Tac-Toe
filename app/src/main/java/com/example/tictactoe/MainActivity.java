package com.example.tictactoe;

import static androidx.appcompat.app.AlertDialog.*;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private String startGame = "X";
    int b1 = 5, b2 = 5, b3 = 5, b4 = 5, b5 = 5, b6 = 5, b7 = 5, b8 = 5, b9 = 5, i = 0, xCount = 0, oCount = 0;
    private TextView ScoreX, ScoreO;
    private boolean[] buttonClicked = {false, false, false, false, false, false, false, false, false};
    private Button Reset;
    private AlertDialog alertDialog;
    //private AlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.buttonImage1);
        btn2 = findViewById(R.id.buttonImage2);
        btn3 = findViewById(R.id.buttonImage3);
        btn4 = findViewById(R.id.buttonImage4);
        btn5 = findViewById(R.id.buttonImage5);
        btn6 = findViewById(R.id.buttonImage6);
        btn7 = findViewById(R.id.buttonImage7);
        btn8 = findViewById(R.id.buttonImage8);
        btn9 = findViewById(R.id.buttonImage9);

        ScoreX = findViewById(R.id.ScoreX);
        ScoreO = findViewById(R.id.ScoreO);

        Reset = findViewById(R.id.Reset);



        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn1.setImageDrawable(null);
                btn2.setImageDrawable(null);
                btn3.setImageDrawable(null);
                btn4.setImageDrawable(null);
                btn5.setImageDrawable(null);
                btn6.setImageDrawable(null);
                btn7.setImageDrawable(null);
                btn8.setImageDrawable(null);
                btn9.setImageDrawable(null);

                resetValues();
                // Reset variables and counts
                xCount = 0;
                oCount = 0;

                // Update score TextViews
                ScoreX.setText("ScoreX: " + xCount);
                ScoreO.setText("ScoreO: " + oCount);
                for (int i = 0; i < buttonClicked.length; i++) {
                    buttonClicked[i] = false;
                }


            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!buttonClicked[0]) {  // Check if the button is already clicked
                // ... (existing code)
                    if (startGame.equals("X")) {
                        btn1.setImageResource(R.drawable.x);
                        b1 = 1;
                        i++;
                    } else if(startGame.equals("O")) {
                        btn1.setImageResource(R.drawable.o);
                        b1 = 0;
                        i++;
                    }

                    choosePlayer();
                    winningGame();
                    buttonClicked[0] = true;  // Mark the button as clicked
            }


            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!buttonClicked[1]) {
                    if (startGame.equals("X")) {
                        btn2.setImageResource(R.drawable.x);
                        b2 = 1;
                        i++;
                    } else {
                        btn2.setImageResource(R.drawable.o);
                        b2 = 0;
                        i++;
                    }

                    choosePlayer();
                    winningGame();
                    buttonClicked[1] = true;
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!buttonClicked[2]) {
                if(startGame.equals("X")) {
                    btn3.setImageResource(R.drawable.x);
                    b3 = 1;
                    i++;
                } else {
                    btn3.setImageResource(R.drawable.o);
                    b3 = 0;
                    i++;
                }

                choosePlayer();
                winningGame();
                    buttonClicked[2] = true;
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!buttonClicked[3]) {
                    if (startGame.equals("X")) {
                        btn4.setImageResource(R.drawable.x);
                        b4 = 1;
                    } else {
                        btn4.setImageResource(R.drawable.o);
                        b4 = 0;
                    }
                    i++;

                    choosePlayer();
                    winningGame();
                    buttonClicked[3] = true;
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!buttonClicked[4]) {
                    if (startGame.equals("X")) {
                        btn5.setImageResource(R.drawable.x);
                        b5 = 1;
                        i++;
                    } else {
                        btn5.setImageResource(R.drawable.o);
                        b5 = 0;
                        i++;
                    }

                    choosePlayer();
                    winningGame();
                    buttonClicked[4] = true;
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!buttonClicked[5]) {
                    if (startGame.equals("X")) {
                        btn6.setImageResource(R.drawable.x);
                        b6 = 1;
                        i++;
                    } else {
                        btn6.setImageResource(R.drawable.o);
                        b6 = 0;
                        i++;
                    }

                    choosePlayer();
                    winningGame();
                    buttonClicked[5] = true;
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!buttonClicked[6]) {
                    if (startGame.equals("X")) {
                        btn7.setImageResource(R.drawable.x);
                        b7 = 1;
                        i++;
                    } else {
                        btn7.setImageResource(R.drawable.o);
                        b7 = 0;
                        i++;
                    }

                    choosePlayer();
                    winningGame();
                    buttonClicked[6] = true;
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!buttonClicked[7]) {
                    if (startGame.equals("X")) {
                        btn8.setImageResource(R.drawable.x);
                        b8 = 1;
                        i++;
                    } else {
                        btn8.setImageResource(R.drawable.o);
                        b8 = 0;
                        i++;
                    }

                    choosePlayer();
                    winningGame();
                    buttonClicked[7] = true;
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!buttonClicked[8]) {
                    if (startGame.equals("X")) {
                        btn9.setImageResource(R.drawable.x);
                        b9 = 1;
                        i++;
                    } else {
                        btn9.setImageResource(R.drawable.o);
                        b9 = 0;
                        i++;
                    }

                    choosePlayer();
                    winningGame();
                    buttonClicked[8] = true;
                }
            }
        });


    }

    private void winningGame() {
        if((b1==1) && (b2==1) && (b3==1)){

            AlertDialog.Builder builder= new Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            ScoreX.setText("ScoreX: " + xCount);

        }

        else if((b4==1) && (b5==1) && (b6==1)){

            AlertDialog.Builder builder= new Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            ScoreX.setText("ScoreX: " + xCount);

        }

        else if((b7==1) && (b8==1) && (b9==1)){

            AlertDialog.Builder builder= new Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            ScoreX.setText("ScoreX: " + xCount);

        }

        else if((b1==1) && (b4==1) && (b7==1)){

            AlertDialog.Builder builder= new Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            ScoreX.setText("ScoreX: " + xCount);

        }

        else if((b2==1) && (b5==1) && (b8==1)){

            Builder builder= new Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            ScoreX.setText("ScoreX: " + xCount);

        }

        else if((b3==1) && (b6==1) && (b9==1)){

            Builder builder= new Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            ScoreX.setText("ScoreX: " + xCount);

        }

        else if((b1==1) && (b5==1) && (b9==1)){

            Builder builder= new Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            ScoreX.setText("ScoreX: " + xCount);

        }

        else if((b3==1) && (b5==1) && (b7==1)){

            Builder builder= new Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            ScoreX.setText("ScoreX: " + xCount);

        }



        else if((b1==0) && (b2==0) && (b3==0)){

            Builder builder= new Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            ScoreO.setText("ScoreO: " + oCount);

        }

        else if((b4==0) && (b5==0) && (b6==0)){

            Builder builder= new Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            ScoreO.setText("ScoreO: " + oCount);

        }

        else if((b7==0) && (b8==0) && (b9==0)){

            Builder builder= new Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            ScoreO.setText("ScoreO: " + oCount);

        }

        else if((b1==0) && (b4==0) && (b7==0)){

            Builder builder= new Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            ScoreO.setText("ScoreO: " + oCount);

        }

        else if((b2==0) && (b5==0) && (b8==0)){

            Builder builder= new Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            ScoreO.setText("ScoreO: " + oCount);

        }

        else if((b3==0) && (b7==0) && (b9==0)){

            Builder builder= new Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            ScoreO.setText("ScoreO: " + oCount);

        }

        else if((b1==0) && (b5==0) && (b9==0)){

            Builder builder= new Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            ScoreO.setText("ScoreO: " + oCount);

        }

        else if((b3==0) && (b5==0) && (b7==0)){

            Builder builder= new Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int which) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            ScoreO.setText("ScoreO: " + oCount);

        }
        else{
            if(i==9){
                AlertDialog.Builder builder= new Builder(this);
                builder.setMessage("No one Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        btn1.setImageDrawable(null);
                        btn2.setImageDrawable(null);
                        btn3.setImageDrawable(null);
                        btn4.setImageDrawable(null);
                        btn5.setImageDrawable(null);
                        btn6.setImageDrawable(null);
                        btn7.setImageDrawable(null);
                        btn8.setImageDrawable(null);
                        btn9.setImageDrawable(null);
                        resetValues();
                    }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        }
    }

    private void choosePlayer() {
        if (startGame.equals("X")) {
            startGame = "O";
        } else {
            startGame = "X";
        }
    }
        private void resetValues () {
            b1 = 5;
            b2 = 5;
            b3 = 5;
            b4 = 5;
            b5 = 5;
            b6 = 5;
            b7 = 5;
            b8 = 5;
            b9 = 5;
            i=0;
            for (int i = 0; i < buttonClicked.length; i++) {
                buttonClicked[i] = false;
            }
        }
    }
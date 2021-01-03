//Name: Dev Patel
//Date: April 14, 2020
package com.example.mariotictactoe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;
public class GameScreen extends AppCompatActivity {

    //set up 3x3 grid
    int board[][] = new int[3][3];

    //initialize the turn to start with the computer

    int turn = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);
    }

//method which will flip between the player's and computer's turn

    public void flip(ImageView i) {



        if (turn == 1) {
            turn = 2;
        } else if (turn == 2) {
            turn = 1;
        }


        if (turn == 1) {

            i.setImageResource(R.drawable.opic);
            computerturn();


        } else {

            i.setImageResource(R.drawable.xpic);

        }

    }

    //method which will handle the win case

    public void win() {
        int winner = 0;
        if (board[0][0] == board[0][1] && board[0][0] == board[0][2] && board[0][0] != 0)
            winner = board[0][0];
        else if (board[1][0] == board[1][1] && board[1][0] == board[1][2] && board[1][0] != 0)
            winner = board[1][0];
        else if (board[2][0] == board[2][1] && board[2][0] == board[2][2] && board[2][0] != 0)
            winner = board[2][0];
        else if (board[0][0] == board[1][0] && board[0][0] == board[2][0] && board[0][0] != 0)
            winner = board[0][0];
        else if (board[0][1] == board[1][1] && board[0][1] == board[2][1] && board[0][1] != 0)
            winner = board[0][1];
        else if (board[0][2] == board[1][2] && board[0][2] == board[2][2] && board[0][2] != 0)
            winner = board[0][2];
        else if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[1][1] != 0)
            winner = board[1][1];
        else if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][0] != 0)
            winner = board[0][2];

        else if (board[0][0] != 0 && board[0][1] != 0 && board[0][2] != 0 &&
                board[1][0] != 0 && board[1][1] != 0 && board[1][2] != 0 &&
                board[2][0] != 0 && board[2][1] != 0 && board[2][2] != 0)
            winner = 3;
        //if luigi wins (computer wins)
        if (winner == 1) {
            luigiwin();
        }
        //if mario wins (player wins)
        else if (winner == 2) {
            mariowin();
        } else if (winner == 3) {
            tie();
            //     tie();

        }
    }

    //aClick to iClick are the methods which change the image from the blank icon to the corresponding player's icon when clicked
    public void aClick(View view) {
        if (board[0][0] == 0) {
            ImageView i = (ImageView) findViewById(R.id.a);
            board[0][0] = turn;
            flip(i);
        } else {
            Toast.makeText(getApplicationContext(), "Place already taken", Toast.LENGTH_SHORT).show();
        }
        win();
    }


    public void bClick(View view) {
        if (board[0][1] == 0) {
            ImageView i = (ImageView) findViewById(R.id.b);
            board[0][1] = turn;
            flip(i);
        } else {
            Toast.makeText(getApplicationContext(), "Place already taken", Toast.LENGTH_SHORT).show();
        }
        win();
    }

    public void cClick(View view) {
        if (board[0][2] == 0) {
            ImageView i = (ImageView) findViewById(R.id.c);
            board[0][2] = turn;
            flip(i);
        } else {
            Toast.makeText(getApplicationContext(), "Place already taken", Toast.LENGTH_SHORT).show();
        }
        win();
    }

    public void dClick(View view) {
        if (board[1][0] == 0) {
            ImageView i = (ImageView) findViewById(R.id.d);
            board[1][0] = turn;
            flip(i);
        } else {
            Toast.makeText(getApplicationContext(), "Place already taken", Toast.LENGTH_SHORT).show();
        }
        win();
    }


    public void eClick(View view) {
        if (board[1][1] == 0) {
            ImageView i = (ImageView) findViewById(R.id.e);
            board[1][1] = turn;
            flip(i);
        } else {
            Toast.makeText(getApplicationContext(), "Place already taken", Toast.LENGTH_SHORT).show();
        }
        win();
    }


    public void fClick(View view) {
        if (board[1][2] == 0) {
            ImageView i = (ImageView) findViewById(R.id.f);
            board[1][2] = turn;
            flip(i);
        } else {
            Toast.makeText(getApplicationContext(), "Place already taken", Toast.LENGTH_SHORT).show();
        }
        win();
    }

    public void gClick(View view) {
        if (board[2][0] == 0) {
            ImageView i = (ImageView) findViewById(R.id.g);
            board[2][0] = turn;
            flip(i);
        } else {
            Toast.makeText(getApplicationContext(), "Place already taken", Toast.LENGTH_SHORT).show();
        }
        win();
    }

    public void hClick(View view) {
        if (board[2][1] == 0) {
            ImageView i = (ImageView) findViewById(R.id.h);
            board[2][1] = turn;
            flip(i);
        } else {
            Toast.makeText(getApplicationContext(), "Place already taken", Toast.LENGTH_SHORT).show();
        }
        win();
    }

    public void iClick(View view) {
        if (board[2][2] == 0) {
            ImageView i = (ImageView) findViewById(R.id.i);
            board[2][2] = turn;
            flip(i);
        } else {
            Toast.makeText(getApplicationContext(), "Place already taken", Toast.LENGTH_SHORT).show();
        }
        win();
    }

    //method to reset the grid when bottom 'reset' button is pressed
    public void reset(View view) {
        ImageView a = (ImageView) findViewById(R.id.a);
        a.setImageResource(R.drawable.blank);
        ImageView b = (ImageView) findViewById(R.id.b);
        b.setImageResource(R.drawable.blank);
        ImageView c = (ImageView) findViewById(R.id.c);
        c.setImageResource(R.drawable.blank);
        ImageView d = (ImageView) findViewById(R.id.d);
        d.setImageResource(R.drawable.blank);
        ImageView e = (ImageView) findViewById(R.id.e);
        e.setImageResource(R.drawable.blank);
        ImageView f = (ImageView) findViewById(R.id.f);
        f.setImageResource(R.drawable.blank);
        ImageView g = (ImageView) findViewById(R.id.g);
        g.setImageResource(R.drawable.blank);
        ImageView h = (ImageView) findViewById(R.id.h);
        h.setImageResource(R.drawable.blank);
        ImageView i = (ImageView) findViewById(R.id.i);
        i.setImageResource(R.drawable.blank);


        for (int k = 0; k < 3; k++) {
            for (int j = 0; j < 3; j++) {
                board[k][j] = 0;

            }
        }
    }

    //method to display dialog box if game ends in a tie
    public void tie() {

        new AlertDialog.Builder(this)
                //The title on the Dialog
                .setTitle("Mario! You have won.")
                //The message that will appear
                .setMessage("Congradfsdfsdions!" +
                        "\nYou've beaten Luigi")
                //What to do if the button is pressed
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //do something if they click the button
                        tosplash();
//otherwise, it just dismisses the dialog
                    }
                }).show();


    }

    //If mario wins (THE USER)
    public void mariowin() {
        new AlertDialog.Builder(this)
                //The title on the Dialog
                .setTitle("Mario! You have won.")
                //The message that will appear
                .setMessage("Congratulations!" +
                        "\nYou've beaten Luigi")
                //What to do if the button is pressed
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //do something if they click the button
                        tosplash();
//otherwise, it just dismisses the dialog
                    }
                }).show();
    }

    //Method to handle if the computer wins
    public void luigiwin() {
        new AlertDialog.Builder(this)
                //The title on the Dialog
                .setTitle("Luigi has won!")
                //The message that will appear
                .setMessage("You have let your brother win!" +
                        "\nWould you like to have a rematch?")
                //What to do if the button is pressed
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        tosplash();
                        //do something if they click the button
//otherwise, it just dismisses the dialog
                    }
                }).show();
    }


    public void tosplash() {
        Intent s = new Intent(this, MainActivity.class);
        startActivity(s);

    }


    public void ins(View view) {

        new AlertDialog.Builder(this)
                //The title on the Dialog
                .setTitle("Instructions")
                //The message that will appear
                .setMessage("1. Take turns with the computer putting tokens in the empty squares" +
                        "\n2. The objective is to create a line of three using your tokens" +
                        "\n3. When either player has won, or all squares are taken up; The game is over")
                //What to do if the button is pressed
                .setPositiveButton("Close", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                        //do something if they click the button
//otherwise, it just dismisses the dialog
                    }
                }).show();

    }


    //Code chooses a number from 1-9, and then calls the method that corresponds with a spot on the grid
    public void computerturn() {


        int click = (int) (Math.random() * 10);


        if (click == 1) {
            //ImageView i = (ImageView) findViewById(R.id.a);
            aBot();

        } else if (click == 2) {
            // ImageView i = (ImageView) findViewById(R.id.b);
            bBot();
        } else if (click == 3) {
            //   ImageView i = (ImageView) findViewById(R.id.h);
            cBot();
        } else if (click == 4) {
            //   ImageView i = (ImageView) findViewById(R.id.c);
            dBot();
        } else if (click == 5) {
            //   ImageView i = (ImageView) findViewById(R.id.i);
            eBot();
        } else if (click == 6) {
            //  ImageView i = (ImageView) findViewById(R.id.d);
            fBot();
        } else if (click == 7) {
            // ImageView i = (ImageView) findViewById(R.id.e);
            gBot();
        } else if (click == 8) {
            //    ImageView i = (ImageView) findViewById(R.id.f);
            hBot();
        } else if (click == 9) {
            //   ImageView i = (ImageView) findViewById(R.id.g);
            iBot();
        } else {
            computerturn();
        }


    }

//aBot() to iBot() gets called from computerturn() and sees if the spot on the grid is available.
// If it is, the code changes it to a luigi icon. Otherwise, it runs the computerturn() method again to pick another spot on the grid

    public void aBot() {
        if (board[0][0] == 0) {
            ImageView i = (ImageView) findViewById(R.id.a);
            board[0][0] = 1;
            flip(i);

        } else {
            computerturn();
        }
        win();
    }

    public void bBot() {
        if (board[0][1] == 0) {
            ImageView i = (ImageView) findViewById(R.id.b);
            board[0][1] = 1;
            flip(i);
        } else {
            computerturn();
        }
        win();
    }

    public void cBot() {
        if (board[0][2] == 0) {
            ImageView i = (ImageView) findViewById(R.id.c);
            board[0][2] = 1;
            flip(i);
        } else {
            computerturn();
        }
        win();
    }

    public void dBot() {
        if (board[1][0] == 0) {
            ImageView i = (ImageView) findViewById(R.id.d);
            board[1][0] = 1;
            flip(i);
        } else {
            computerturn();
        }
        win();
    }

    public void eBot() {
        if (board[1][1] == 0) {
            ImageView i = (ImageView) findViewById(R.id.e);
            board[1][1] = 1;
            flip(i);
        } else {
            computerturn();
        }
        win();
    }

    public void fBot() {
        if (board[1][2] == 0) {
            ImageView i = (ImageView) findViewById(R.id.f);
            board[1][2] = 1;
            flip(i);
        } else {
            computerturn();
        }
        win();
    }

    public void gBot() {
        if (board[2][0] == 0) {
            ImageView i = (ImageView) findViewById(R.id.g);
            board[2][0] = 1;
            flip(i);
        } else {
            computerturn();
        }
        win();
    }

    public void hBot() {
        if (board[2][1] == 0) {
            ImageView i = (ImageView) findViewById(R.id.h);
            board[2][1] = 1;
            flip(i);
        } else {
            computerturn();
        }
        win();
    }

    public void iBot() {
        if (board[2][2] == 0) {
            ImageView i = (ImageView) findViewById(R.id.i);
            board[2][2] = 1;
            flip(i);
        } else {
            computerturn();
        }
        win();
    }




}
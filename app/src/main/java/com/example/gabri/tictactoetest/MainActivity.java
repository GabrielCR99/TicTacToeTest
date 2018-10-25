package com.example.gabri.tictactoetest;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    private int activePlayer = 0;
    boolean gameOver = false;

    @BindViews({R.id.imageView1, R.id.imageView2, R.id.imageView3, R.id.imageView4, R.id.imageView5, R.id.imageView6, R.id.imageView7
            , R.id.imageView8, R.id.imageView9})
    List<ImageView> imageViews;

    @OnClick(R.id.imageView1)
    public void aVoid(View view) {

        imageViews.get(0).setEnabled(false);
        imageViews.get(0).setTranslationY(-3000f);

        if (activePlayer == 0) {
            imageViews.get(0).setImageResource(R.drawable.capture);
            activePlayer = 1;
            imageViews.get(0).setTag(getString(R.string.bolso));

        } else if (activePlayer == 1) {
            imageViews.get(0).setImageResource(R.drawable.capture_2);
            activePlayer = 0;
            imageViews.get(0).setTag(getString(R.string.hadd));
        }

        imageViews.get(0).animate().translationYBy(3000f).setDuration(500);

        if (imageViews.get(0).getTag().equals(getString(R.string.bolso)))
        {
            MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.scream);
            mediaPlayer.start();
        }
        else if (imageViews.get(0).getTag().equals(getString(R.string.hadd)))
        {
            MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.oh);
            mediaPlayer.start();

        }
        checkWin();
    }


    @OnClick(R.id.imageView2)
    public void aVoid2(View view) {
        imageViews.get(1).setEnabled(false);

        imageViews.get(1).setImageResource(R.drawable.capture);

        if (activePlayer == 0) {
            imageViews.get(1).setImageResource(R.drawable.capture);
            activePlayer = 1;
            imageViews.get(1).setTag(getString(R.string.bolso));
        } else if (activePlayer == 1) {
            imageViews.get(1).setImageResource(R.drawable.capture_2);
            activePlayer = 0;
            imageViews.get(1).setTag(getString(R.string.hadd));
        }
        if (imageViews.get(1).getTag().equals(getString(R.string.bolso)))
        {
            MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.scream);
            mediaPlayer.start();
        }
        else if (imageViews.get(1).getTag().equals(getString(R.string.hadd)))
        {
            MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.oh);
            mediaPlayer.start();

        }
        checkWin();
    }

    @OnClick(R.id.imageView3)
    public void aVoid3(View view) {
        imageViews.get(2).setEnabled(false);

        imageViews.get(2).setImageResource(R.drawable.capture);

        if (activePlayer == 0) {
            imageViews.get(2).setImageResource(R.drawable.capture);
            activePlayer = 1;
            imageViews.get(2).setTag(getString(R.string.bolso));
        } else if (activePlayer == 1) {
            imageViews.get(2).setImageResource(R.drawable.capture_2);
            activePlayer = 0;
            imageViews.get(2).setTag(getString(R.string.hadd));
        }

        //checkSound
        if (imageViews.get(2).getTag().equals(getString(R.string.bolso)))
        {
            MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.scream);
            mediaPlayer.start();
        }
        else if (imageViews.get(2).getTag().equals(getString(R.string.hadd)))
        {
            MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.oh);
            mediaPlayer.start();

        }
        checkWin();
    }

    @OnClick(R.id.imageView4)
    public void aVoid4(View view) {
        imageViews.get(3).setEnabled(false);

        imageViews.get(3).setImageResource(R.drawable.capture);

        if (activePlayer == 0) {
            imageViews.get(3).setImageResource(R.drawable.capture);
            activePlayer = 1;
            imageViews.get(3).setTag(getString(R.string.bolso));
        } else if (activePlayer == 1) {
            imageViews.get(3).setImageResource(R.drawable.capture_2);
            activePlayer = 0;
            imageViews.get(3).setTag(getString(R.string.hadd));
        }

        if (imageViews.get(3).getTag().equals(getString(R.string.bolso)))
        {
            MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.scream);
            mediaPlayer.start();
        }
        else if (imageViews.get(3).getTag().equals(getString(R.string.hadd)))
        {
            MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.oh);
            mediaPlayer.start();

        }
        checkWin();
    }

    @OnClick(R.id.imageView5)
    public void aVoid5(View view) {
        imageViews.get(4).setEnabled(false);

        imageViews.get(4).setImageResource(R.drawable.capture);

        if (activePlayer == 0) {
            imageViews.get(4).setImageResource(R.drawable.capture);
            activePlayer = 1;
            imageViews.get(4).setTag(getString(R.string.bolso));
        } else if (activePlayer == 1) {
            imageViews.get(4).setImageResource(R.drawable.capture_2);
            activePlayer = 0;
            imageViews.get(4).setTag(getString(R.string.hadd));
        }

        if (imageViews.get(4).getTag().equals(getString(R.string.bolso)))
        {
            MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.scream);
            mediaPlayer.start();
        }
        else if (imageViews.get(4).getTag().equals(getString(R.string.hadd)))
        {
            MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.oh);
            mediaPlayer.start();

        }
        checkWin();
    }

    @OnClick(R.id.imageView6)
    public void aVoid6(View view) {
        imageViews.get(5).setEnabled(false);

        imageViews.get(5).setImageResource(R.drawable.capture);

        if (activePlayer == 0) {
            imageViews.get(5).setImageResource(R.drawable.capture);
            activePlayer = 1;
            imageViews.get(5).setTag(getString(R.string.bolso));
        } else if (activePlayer == 1) {
            imageViews.get(5).setImageResource(R.drawable.capture_2);
            activePlayer = 0;
            imageViews.get(5).setTag(getString(R.string.hadd));
        }

        if (imageViews.get(5).getTag().equals(getString(R.string.bolso)))
        {
            MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.scream);
            mediaPlayer.start();
        }
        else if (imageViews.get(5).getTag().equals(getString(R.string.hadd)))
        {
            MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.oh);
            mediaPlayer.start();

        }
        checkWin();
    }

    @OnClick(R.id.imageView7)
    public void aVoid7(View view) {
        imageViews.get(6).setEnabled(false);

        imageViews.get(6).setImageResource(R.drawable.capture);

        if (activePlayer == 0) {
            imageViews.get(6).setImageResource(R.drawable.capture);
            activePlayer = 1;
            imageViews.get(6).setTag(getString(R.string.bolso));
        } else if (activePlayer == 1) {
            imageViews.get(6).setImageResource(R.drawable.capture_2);
            activePlayer = 0;
            imageViews.get(6).setTag(getString(R.string.hadd));
        }

        if (imageViews.get(6).getTag().equals(getString(R.string.bolso)))
        {
            MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.scream);
            mediaPlayer.start();
        }
        else if (imageViews.get(6).getTag().equals(getString(R.string.hadd)))
        {
            MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.oh);
            mediaPlayer.start();

        }
        checkWin();
    }

    @OnClick(R.id.imageView8)
    public void aVoid8(View view) {
        imageViews.get(7).setEnabled(false);

        imageViews.get(7).setImageResource(R.drawable.capture);

        if (activePlayer == 0) {
            imageViews.get(7).setImageResource(R.drawable.capture);
            activePlayer = 1;
            imageViews.get(7).setTag(getString(R.string.bolso));
        } else if (activePlayer == 1) {
            imageViews.get(7).setImageResource(R.drawable.capture_2);
            activePlayer = 0;
            imageViews.get(7).setTag(getString(R.string.hadd));
        }

        if (imageViews.get(7).getTag().equals(getString(R.string.bolso)))
        {
            MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.scream);
            mediaPlayer.start();
        }
        else if (imageViews.get(7).getTag().equals(getString(R.string.hadd)))
        {
            MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.oh);
            mediaPlayer.start();

        }
        checkWin();
    }

    @OnClick(R.id.imageView9)
    public void aVoid9(View view) {
        imageViews.get(8).setEnabled(false);
        imageViews.get(8).setImageResource(R.drawable.capture);

        if (activePlayer == 0) {
            imageViews.get(8).setImageResource(R.drawable.capture);
            activePlayer = 1;
            imageViews.get(8).setTag(getString(R.string.bolso));
        } else if (activePlayer == 1) {
            imageViews.get(8).setImageResource(R.drawable.capture_2);
            activePlayer = 0;
            imageViews.get(8).setTag(getString(R.string.hadd));
        }

        if (imageViews.get(8).getTag().equals(getString(R.string.bolso)))
        {
            MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.scream);
            mediaPlayer.start();
        }
        else if (imageViews.get(8).getTag().equals(getString(R.string.hadd)))
        {
            MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.oh);
            mediaPlayer.start();

        }
        checkWin();
    }

    public void reset() {
        gameOver = false;
        activePlayer = 0;


        for (int i = 0; i < imageViews.size(); i++) {
            imageViews.get(i).setEnabled(true);
            imageViews.get(i).setTag("");
        }

        GridLayout gridLayout = findViewById(R.id.gridLayout);
        for (int i = 0; i < gridLayout.getChildCount(); i++) {
            ((ImageView) gridLayout.getChildAt(i)).setImageResource(0);
        }
    }

    public void checkWin() {


        if (imageViews.get(0).getTag().equals(getString(R.string.bolso))
                && imageViews.get(1).getTag().equals(getString(R.string.bolso))
                && imageViews.get(2).getTag().equals(getString(R.string.bolso))) {
            for (int i = 0; i < imageViews.size(); i++) {
                imageViews.get(i).setEnabled(false);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            final View view = getLayoutInflater().inflate(R.layout.custom_dialog, null);
            Button button = view.findViewById(R.id.btn_bolso_ok);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    reset();
                    finish();
                }
            });
            builder.setView(view);
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }

        if (imageViews.get(0).getTag().equals(getString(R.string.bolso))
                && imageViews.get(3).getTag().equals(getString(R.string.bolso))
                && imageViews.get(6).getTag().equals(getString(R.string.bolso))) {
            for (int i = 0; i < imageViews.size(); i++) {
                imageViews.get(i).setEnabled(false);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            View view = getLayoutInflater().inflate(R.layout.custom_dialog, null);
            Button button = view.findViewById(R.id.btn_bolso_ok);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    reset();

                }
            });
            builder.setView(view);
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }

        if (imageViews.get(0).getTag().equals(getString(R.string.bolso))
                && imageViews.get(4).getTag().equals(getString(R.string.bolso))
                && imageViews.get(8).getTag().equals(getString(R.string.bolso))) {
            for (int i = 0; i < imageViews.size(); i++) {
                imageViews.get(i).setEnabled(false);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            final View view = getLayoutInflater().inflate(R.layout.custom_dialog, null);
            Button button = view.findViewById(R.id.btn_bolso_ok);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    reset();
                    finish();
                }
            });
            builder.setView(view);
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }

        if (imageViews.get(3).getTag().equals(getString(R.string.bolso))
                && imageViews.get(4).getTag().equals(getString(R.string.bolso))
                && imageViews.get(5).getTag().equals(getString(R.string.bolso))) {
            for (int i = 0; i < imageViews.size(); i++) {
                imageViews.get(i).setEnabled(false);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            final View view = getLayoutInflater().inflate(R.layout.custom_dialog, null);
            Button button = view.findViewById(R.id.btn_bolso_ok);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    reset();
                    finish();
                }
            });
            builder.setView(view);
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }

        if (imageViews.get(6).getTag().equals(getString(R.string.bolso))
                && imageViews.get(7).getTag().equals(getString(R.string.bolso))
                && imageViews.get(8).getTag().equals(getString(R.string.bolso))) {
            for (int i = 0; i < imageViews.size(); i++) {
                imageViews.get(i).setEnabled(false);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            final View view = getLayoutInflater().inflate(R.layout.custom_dialog, null);
            Button okButton = view.findViewById(R.id.btn_bolso_ok);

            okButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    reset();

                }
            });
            builder.setView(view);
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }

        if (imageViews.get(2).getTag().equals(getString(R.string.bolso))
                && imageViews.get(5).getTag().equals(getString(R.string.bolso))
                && imageViews.get(8).getTag().equals(getString(R.string.bolso))) {
            for (int i = 0; i < imageViews.size(); i++) {
                imageViews.get(i).setEnabled(false);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            final View view = getLayoutInflater().inflate(R.layout.custom_dialog, null);
            Button okButton = view.findViewById(R.id.btn_bolso_ok);

            okButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    reset();

                }
            });
            builder.setView(view);
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }

        //HADDAD WINS

        if (imageViews.get(0).getTag().equals(getString(R.string.hadd))
                && imageViews.get(1).getTag().equals(getString(R.string.hadd))
                && imageViews.get(2).getTag().equals(getString(R.string.hadd))) {
            for (int i = 0; i < imageViews.size(); i++) {
                imageViews.get(i).setEnabled(false);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            final View view = getLayoutInflater().inflate(R.layout.dialog_haddad, null);
            Button button = view.findViewById(R.id.btn_haddad_ok);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    reset();
                    finish();
                }
            });
            builder.setView(view);
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }


    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.reset)
            reset();
        return true;
    }
}

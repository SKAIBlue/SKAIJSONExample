package com.skaiblue.skaijsonexample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.skaiblue.skaijson.SKAIJSON;
import com.skaiblue.skaijsonexample.data.JRandomUser;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.text)
    TextView text;

    private MainActivity that;

    private SKAIJSON.OnParseCompleted<JRandomUser> randomUserOnParseCompleted = new SKAIJSON.OnParseCompleted<JRandomUser>() {
        @Override
        public void onParseComplete(JRandomUser jRandomUser) {
            text.setText(jRandomUser.toString());
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        that = this;
    }


    @OnClick(R.id.fab)
    void onClickFAB() {
        URL url = null;
        try {
            url = new URL("https://randomuser.me/api");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            SKAIJSON.getFromHttpConnectionAsync(JRandomUser.class, con, that, randomUserOnParseCompleted);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
package com.example.bcmb.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button mOne;
    private Button mTwo;
    private Button mThree;
    private Button mFour;
    private Button mFive;
    private Button mSix;
    private Button mSeven;
    private Button mEight;
    private Button mNine;
    private Button mZero;
    private Button mEqual;
    private Button mMultiply;
    private Button mDevide;
    private Button mMinus;
    private Button mPlus;
    private Button mClear;
    private TextView mScreen;
    private String screenContent = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mScreen = (TextView) findViewById(R.id.textView);
        mOne = (Button) findViewById(R.id.oneb);
        mOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "1";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
            }
        });
        mTwo = (Button) findViewById(R.id.twob);
        mTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "2";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
            }
        });
        mThree = (Button) findViewById(R.id.threeb);
        mThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "3";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
            }
        });
        mFour = (Button) findViewById(R.id.fourb);
        mFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "4";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
            }
        });
        mFive = (Button) findViewById(R.id.fiveb);
        mFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "5";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
            }
        });
        mSix = (Button) findViewById(R.id.sixb);
        mSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "6";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
            }
        });
        mSeven = (Button) findViewById(R.id.sevenb);
        mSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "7";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
            }
        });
        mEight = (Button) findViewById(R.id.eightb);
        mEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "8";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
            }
        });
        mNine = (Button) findViewById(R.id.nineb);
        mNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "9";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
            }
        });
        mZero = (Button) findViewById(R.id.zerob);
        mZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "0";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
            }
        });
        mEqual = (Button) findViewById(R.id.equalb);
        mEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "=";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
            }
        });
        mMultiply = (Button) findViewById(R.id.multiplyb);
        mMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "*";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
            }
        });
        mDevide = (Button) findViewById(R.id.devideb);
        mDevide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "/";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
            }
        });
        mMinus = (Button) findViewById(R.id.minusb);
        mMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "-";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
            }
        });
        mPlus = (Button) findViewById(R.id.plusb);
        mPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "+";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
            }
        });
        mClear = (Button) findViewById(R.id.clearb);
        mClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent = "";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
            }
        });
    }
}

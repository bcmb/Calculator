package com.example.bcmb.calculator;

import android.content.res.Configuration;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private static final String SCREEN = "screen";
    private static final String FIRST_ARG = "farg";
    private static final String SECOND_ARG = "sarg";
    private static final String OPERATOR = "operator";
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
    private String operator = "";
    private String firstArg = "";
    private String secondArg = "";
    private int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            screenContent = savedInstanceState.getString(SCREEN, "");
            operator = savedInstanceState.getString(OPERATOR, "");
            firstArg = savedInstanceState.getString(FIRST_ARG, "");
            secondArg = savedInstanceState.getString(SECOND_ARG, "");
        }
        setContentView(R.layout.main_layout);
        mScreen = (TextView) findViewById(R.id.textView);
        mOne = (Button) findViewById(R.id.oneb);
        mOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "1";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                checkWhihcArgIsSet(firstArg, secondArg, operator, "1");
            }
        });
        mTwo = (Button) findViewById(R.id.twob);
        mTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "2";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                checkWhihcArgIsSet(firstArg, secondArg, operator, "2");
            }
        });
        mThree = (Button) findViewById(R.id.threeb);
        mThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "3";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                checkWhihcArgIsSet(firstArg, secondArg, operator, "3");
            }
        });
        mFour = (Button) findViewById(R.id.fourb);
        mFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "4";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                checkWhihcArgIsSet(firstArg, secondArg, operator, "4");
            }
        });
        mFive = (Button) findViewById(R.id.fiveb);
        mFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "5";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                checkWhihcArgIsSet(firstArg, secondArg, operator, "5");
            }
        });
        mSix = (Button) findViewById(R.id.sixb);
        mSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "6";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                checkWhihcArgIsSet(firstArg, secondArg, operator, "6");
            }
        });
        mSeven = (Button) findViewById(R.id.sevenb);
        mSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "7";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                checkWhihcArgIsSet(firstArg, secondArg, operator, "7");
            }
        });
        mEight = (Button) findViewById(R.id.eightb);
        mEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "8";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                checkWhihcArgIsSet(firstArg, secondArg, operator, "8");
            }
        });
        mNine = (Button) findViewById(R.id.nineb);
        mNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "9";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                checkWhihcArgIsSet(firstArg, secondArg, operator, "9");
            }
        });
        mZero = (Button) findViewById(R.id.zerob);
        mZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "0";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                checkWhihcArgIsSet(firstArg, secondArg, operator, "0");
            }
        });
        mEqual = (Button) findViewById(R.id.equalb);
        mEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateResult();
                mScreen.setText((""+result).toCharArray(), 0, (""+result).toCharArray().length);
            }
        });
        mMultiply = (Button) findViewById(R.id.multiplyb);
        mMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "*";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                operator = "*";
            }
        });
        mDevide = (Button) findViewById(R.id.devideb);
        mDevide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "/";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                operator = "/";
            }
        });
        mMinus = (Button) findViewById(R.id.minusb);
        mMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "-";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                operator = "-";
            }
        });
        mPlus = (Button) findViewById(R.id.plusb);
        mPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "+";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                operator = "+";
            }
        });
        mClear = (Button) findViewById(R.id.clearb);
        mClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent = "";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                firstArg = "";
                secondArg = "";
                operator = "";
            }
        });
    }

    private void checkWhihcArgIsSet(String firstArg, String secondArg, String operator, String num) {
        if (firstArg.equals("") | operator.equals("")) this.firstArg += num;
        if (!operator.equals("")) this.secondArg += num;
    }

    private void calculateResult() {
        if (firstArg.equals("") | operator.equals("") | operator.equals("")) result = 0;
        switch (operator) {
            case "+":
                result = (Integer.parseInt(firstArg) + Integer.parseInt(secondArg));
                break;
            case "-":
                result = (Integer.parseInt(firstArg) - Integer.parseInt(secondArg));
                break;
            case "/":
                result = (Integer.parseInt(firstArg) / Integer.parseInt(secondArg));
                break;
            case "*":
                result = (Integer.parseInt(firstArg) * Integer.parseInt(secondArg));
                break;
            default:
                result = 0;
                break;
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString(FIRST_ARG, firstArg);
        savedInstanceState.putString(SECOND_ARG, secondArg);
        savedInstanceState.putString(OPERATOR, operator);
        savedInstanceState.putString(SCREEN, screenContent);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
    }
}


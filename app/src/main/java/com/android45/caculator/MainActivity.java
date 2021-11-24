package com.android45.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvResult;
    Button btnNumberZero, btnNumber01, btnNumber02, btnNumber03, btnNumber04, btnNumber05, btnNumber06, btnNumber07, btnNumber08, btnNumber09;
    Button btnAdd, btnMinus, btnMultiply, btnDivision, btnDeleteAll, btnNegative, btnPercent;
    Button btnResult;
    String process;
    Float numberOne, numberTwo;
    boolean checkFirst = false;
    boolean checkNegative = false;
    int checkCal = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tvResult);

        btnNumberZero = findViewById(R.id.btnNumberZero);
        btnNumber01 = findViewById(R.id.btnNumber01);
        btnNumber02 = findViewById(R.id.btnNumber02);
        btnNumber03 = findViewById(R.id.btnNumber03);
        btnNumber04 = findViewById(R.id.btnNumber04);
        btnNumber05 = findViewById(R.id.btnNumber05);
        btnNumber06 = findViewById(R.id.btnNumber06);
        btnNumber07 = findViewById(R.id.btnNumber07);
        btnNumber08 = findViewById(R.id.btnNumber08);
        btnNumber09 = findViewById(R.id.btnNumber09);

        btnAdd = findViewById(R.id.btnAdd);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivision = findViewById(R.id.btnDivision);
        btnDeleteAll = findViewById(R.id.btnDeleteAll);
        btnNegative = findViewById(R.id.btnNegative);
        btnPercent = findViewById(R.id.btnPercent);

        btnResult = findViewById(R.id.btnResult);

        btnNumberZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkFirst) {
                    process = tvResult.getText().toString();
                    tvResult.setText(process + "0");
                }
            }
        });

        btnNumber01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkFirst) {
                    process = tvResult.getText().toString();
                    tvResult.setText(process + "1");
                } else {
                    tvResult.setText("1");
                    checkFirst = true;
                }
            }
        });

        btnNumber02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkFirst) {
                    process = tvResult.getText().toString();
                    tvResult.setText(process + "2");
                } else {
                    tvResult.setText("2");
                    checkFirst = true;
                }
            }
        });

        btnNumber03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkFirst) {
                    process = tvResult.getText().toString();
                    tvResult.setText(process + "3");
                } else {
                    tvResult.setText("3");
                    checkFirst = true;
                }
            }
        });

        btnNumber04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkFirst) {
                    process = tvResult.getText().toString();
                    tvResult.setText(process + "4");
                } else {
                    tvResult.setText("4");
                    checkFirst = true;
                }
            }
        });

        btnNumber05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkFirst) {
                    process = tvResult.getText().toString();
                    tvResult.setText(process + "5");
                } else {
                    tvResult.setText("5");
                    checkFirst = true;
                }
            }
        });

        btnNumber06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkFirst) {
                    process = tvResult.getText().toString();
                    tvResult.setText(process + "6");
                } else {
                    tvResult.setText("6");
                    checkFirst = true;
                }
            }
        });

        btnNumber07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkFirst) {
                    process = tvResult.getText().toString();
                    tvResult.setText(process + "7");
                } else {
                    tvResult.setText("7");
                    checkFirst = true;
                }
            }
        });

        btnNumber08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkFirst) {
                    process = tvResult.getText().toString();
                    tvResult.setText(process + "8");
                } else {
                    tvResult.setText("8");
                    checkFirst = true;
                }
            }
        });

        btnNumber09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkFirst) {
                    process = tvResult.getText().toString();
                    tvResult.setText(process + "9");
                } else {
                    tvResult.setText("9");
                    checkFirst = true;
                }
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvResult.getText().toString();
                tvResult.setText(process + "+");
                checkCal = 1;
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvResult.getText().toString();
                tvResult.setText(process + "-");
                checkCal = 2;
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvResult.getText().toString();
                tvResult.setText(process + "x");
                checkCal = 3;
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvResult.getText().toString();
                tvResult.setText(process + "/");
                checkCal = 4;
            }
        });

        btnDeleteAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("0");
                checkFirst = false;
            }
        });

        btnNegative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkNegative) {
                    process = tvResult.getText().toString();
                    tvResult.setText("-" + process);
                    checkNegative = true;
                } else {
                    process = tvResult.getText().toString().substring(1);
                    tvResult.setText(process);
                    checkNegative = false;
                }
            }
        });

        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvResult.getText().toString();
                float tg = Float.parseFloat(process);
                tg /= 100;
                process = String.valueOf(tg);
                tvResult.setText(process);
            }
        });

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkCal != -1) {
                    switch (checkCal) {
                        case 1:
                            addTwoNumbers();
                            break;
                        case 2:
                            subtractTwoNumbers();
                            break;
                        case 3:
                            multiplyTwoNumbers();
                            break;
                        case 4:
                            devideTwoNumbers();
                            break;
                    }
                }
                checkCal = -1;
                checkFirst = false;
            }
        });
    }

    protected void addTwoNumbers() {
        process = tvResult.getText().toString();
        try {
            int ok = process.lastIndexOf("+");
            numberOne = Float.parseFloat(process.substring(0, ok));
            numberTwo = Float.parseFloat(process.substring((ok + 1)));
            process = String.valueOf(numberOne + numberTwo);
        } catch (Exception e) {
            process = "Error";
        }
        tvResult.setText(process);
    }

    protected void subtractTwoNumbers() {
        process = tvResult.getText().toString();
        try {
            int ok = process.lastIndexOf("-");
            numberOne = Float.parseFloat(process.substring(0, ok));
            numberTwo = Float.parseFloat(process.substring((ok + 1)));
            process = String.valueOf(numberOne - numberTwo);
        } catch (Exception e) {
            process = "Error";
        }
        tvResult.setText(process);
    }

    protected void multiplyTwoNumbers() {
        process = tvResult.getText().toString();
        try {
            int ok = process.lastIndexOf("x");
            numberOne = Float.parseFloat(process.substring(0, ok));
            numberTwo = Float.parseFloat(process.substring((ok + 1)));
            process = String.valueOf(numberOne * numberTwo);
        } catch (Exception e) {
            process = "Error";
        }
        tvResult.setText(process);
    }

    protected void devideTwoNumbers() {
        process = tvResult.getText().toString();
        try {
            int ok = process.lastIndexOf("/");
            numberOne = Float.parseFloat(process.substring(0, ok));
            numberTwo = Float.parseFloat(process.substring((ok + 1)));
            process = String.valueOf(numberOne / numberTwo);
        } catch (Exception e) {
            process = "Error";
        }
        tvResult.setText(process);
    }
}
package com.cmpe277.android.plumcalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class CalculateActivity extends ActionBarActivity {

    Button one, two, three, four, five, six, seven, eight, nine, zero, clear, add, subtract, equal;
    TextView result;
    boolean issubtract, isadd, istempset, isequal;
    int num1 = 0, num2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        clear = (Button) findViewById(R.id.clear);
        add = (Button) findViewById(R.id.add);
        subtract = (Button) findViewById(R.id.subtract);
        equal = (Button) findViewById(R.id.equal);

        result = (TextView) findViewById(R.id.result);

        /*This is an on click listener for number "1" on the calculator screen,
        * it will display or print number "1" on the screen either getting attached
        * to the preceding number or by replacing the existing numbers on the screen
        * depending upon the intended operation.
        * "istempset" is the boolean value to keep the track of any addition or
        * subtraction operation in progress. */
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (istempset == true || isequal==true) {
                    result.setText("1");
                    istempset = false;
                    isequal=false;
                } else {
                    if (result.getText().equals("0")) {
                        result.setText("1");
                    } else if (result.getText().length() < 7) {
                        result.setText(result.getText() + "1");
                    }
                }
            }
        });

        /*This is an on click listener for number "2" on the calculator screen,
        * it will display or print number "2" on the screen either getting attached
        * to the preceding number or by replacing the existing numbers on the screen
        * depending upon the intended operation.
        * "istempset" is the boolean value to keep the track of any addition or
        * subtraction operation in progress. */
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (istempset == true || isequal==true) {
                    result.setText("2");
                    istempset = false;
                    isequal=false;
                } else {
                    if (result.getText().equals("0")) {
                        result.setText("2");
                    } else if (result.getText().length() < 7) {
                        result.setText(result.getText() + "2");
                    }
                }
            }
        });

        /*This is an on click listener for number "3" on the calculator screen,
        * it will display or print number "3" on the screen either getting attached
        * to the preceding number or by replacing the existing numbers on the screen
        * depending upon the intended operation.
        * "istempset" is the boolean value to keep the track of any addition or
        * subtraction operation in progress. */
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (istempset == true || isequal==true) {
                    result.setText("3");
                    istempset = false;
                    isequal=false;
                } else {
                    if (result.getText().equals("0")) {
                        result.setText("3");
                    } else if (result.getText().length() < 7) {
                        result.setText(result.getText() + "3");
                    }
                }
            }
        });

        /*This is an on click listener for number "4" on the calculator screen,
        * it will display or print number "4" on the screen either getting attached
        * to the preceding number or by replacing the existing numbers on the screen
        * depending upon the intended operation.
        * "istempset" is the boolean value to keep the track of any addition or
        * subtraction operation in progress. */
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (istempset == true || isequal==true) {
                    result.setText("4");
                    istempset = false;
                    isequal=false;
                } else {
                    if (result.getText().equals("0")) {
                        result.setText("4");
                    } else if (result.getText().length() < 7) {
                        result.setText(result.getText() + "4");
                    }
                }
            }
        });

        /*This is an on click listener for number "5" on the calculator screen,
        * it will display or print number "5" on the screen either getting attached
        * to the preceding number or by replacing the existing numbers on the screen
        * depending upon the intended operation.
        * "istempset" is the boolean value to keep the track of any addition or
        * subtraction operation in progress. */
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (istempset == true || isequal==true) {
                    result.setText("5");
                    istempset = false;
                    isequal=false;
                } else {
                    if (result.getText().equals("0")) {
                        result.setText("5");
                    } else if (result.getText().length() < 7) {
                        result.setText(result.getText() + "5");
                    }
                }
            }
        });

        /*This is an on click listener for number "6" on the calculator screen,
        * it will display or print number "6" on the screen either getting attached
        * to the preceding number or by replacing the existing numbers on the screen
        * depending upon the intended operation.
        * "istempset" is the boolean value to keep the track of any addition or
        * subtraction operation in progress. */
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (istempset == true || isequal==true) {
                    result.setText("6");
                    istempset = false;
                    isequal=false;
                } else {
                    if (result.getText().equals("0")) {
                        result.setText("6");
                    } else if (result.getText().length() < 7) {
                        result.setText(result.getText() + "6");
                    }
                }
            }
        });

        /*This is an on click listener for number "7" on the calculator screen,
        * it will display or print number "7" on the screen either getting attached
        * to the preceding number or by replacing the existing numbers on the screen
        * depending upon the intended operation.
        * "istempset" is the boolean value to keep the track of any addition or
        * subtraction operation in progress. */
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (istempset == true || isequal==true) {
                    result.setText("7");
                    istempset = false;
                    isequal=false;
                } else {
                    if (result.getText().equals("0")) {
                        result.setText("7");
                    } else if (result.getText().length() < 7) {
                        result.setText(result.getText() + "7");
                    }
                }
            }
        });

        /*This is an on click listener for number "8" on the calculator screen,
        * it will display or print number "8" on the screen either getting attached
        * to the preceding number or by replacing the existing numbers on the screen
        * depending upon the intended operation.
        * "istempset" is the boolean value to keep the track of any addition or
        * subtraction operation in progress. */
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (istempset == true|| isequal==true) {
                    result.setText("8");
                    istempset = false;
                    isequal=false;
                } else {
                    if (result.getText().equals("0")) {
                        result.setText("8");
                    } else if (result.getText().length() < 7) {
                        result.setText(result.getText() + "8");
                    }
                }
            }
        });

        /*This is an on click listener for number "9" on the calculator screen,
        * it will display or print number "9" on the screen either getting attached
        * to the preceding number or by replacing the existing numbers on the screen
        * depending upon the intended operation.
        * "istempset" is the boolean value to keep the track of any addition or
        * subtraction operation in progress. */
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (istempset == true || isequal==true) {
                    result.setText("9");
                    istempset = false;
                    isequal=false;
                } else {
                    if (result.getText().equals("0")) {
                        result.setText("9");
                    } else if (result.getText().length() < 7) {
                        result.setText(result.getText() + "9");
                    }
                }
            }
        });

        /*This is an on click listener for number "0" on the calculator screen,
        * it will display or print number "0" on the screen either getting attached
        * to the preceding number or by replacing the existing numbers on the screen
        * depending upon the intended operation.
        * "istempset" is the boolean value to keep the track of any addition or
        * subtraction operation in progress. */
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((!result.getText().equals("") && !result.getText().equals("0")) || (!result.getText().equals(null) && !result.getText().equals("0"))) {
                    if (istempset == true || isequal==true) {
                        result.setText("0");
                        istempset = false;
                        isequal=false;
                    } else {
                        result.setText(result.getText() + "0");
                    }
                } else if (result.getText().equals(null) || result.getText().equals("")) {
                    if (istempset == true) {
                        istempset = false;
                    }
                    result.setText("0");
                }
            }
        });

        /*This is an on click listener for "+" button which performs addition of numbers.
        * "issubtract" is the boolean value to check if there is any subtraction operation
        * in progress."isadd" is the boolean value to check if there is any addition
        * operation in progress or if addition of the already entered number has to be
        * performed with the upcoming number which will be entered on the screen*/
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (issubtract == true && istempset == false) {
                        if (num1 != 0) {
                            num2 = Integer.parseInt(result.getText().toString());
                            result.setText(num1 - num2 + "");
                            num1 = num1 - num2;
                            if (num1 > 9999999 || num1 < -9999999) {
                                throw new Exception("");
                            }
                            num2 = 0;
                            istempset = true;
                        } else {
                            num1 = Integer.parseInt(result.getText().toString());
                            num1 = -num1;
                            if (num1 > 9999999 || num1 < -9999999) {
                                throw new Exception("");
                            }
                            result.setText(num1 + "");
                            num2 = 0;
                            istempset = true;
                        }
                    } else if ((issubtract == true && istempset == true) || (isadd == true && istempset == true)) {
                        //do nothing
                    } else if (isadd == true && istempset == false) {
                        if (num1 != 0) {
                            num2 = Integer.parseInt(result.getText().toString());
                            result.setText(num1 + num2 + "");
                            num1 = num1 + num2;
                            if (num1 > 9999999 || num1 < -9999999) {
                                throw new Exception("");
                            }
                            num2 = 0;
                            istempset = true;
                        } else {
                            num1 = Integer.parseInt(result.getText().toString());
                            istempset = true;
                        }
                    } else {
                        if (num1 != 0) {
                            num1 = num1 + Integer.parseInt(result.getText().toString());
                        } else if (!result.getText().equals(null) && !result.getText().equals("")) {
                            num1 = Integer.parseInt(result.getText().toString());
                        }
                        issubtract = false;
                        isadd = true;
                        istempset = true;
                    }
                    isadd = true;
                    issubtract = false;
                } catch (Exception e) {
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    zero.setEnabled(false);
                    add.setEnabled(false);
                    subtract.setEnabled(false);
                    equal.setEnabled(false);
                    result.setText("Number too large!");
                }
            }
        });

        /*This is an on click listener for "-" button which performs subtraction of numbers.
        * "isadd" is the boolean value to check if there is any addition operation
        * in progress."issubtract" is the boolean value to check if there is any subtraction
        * operation in progress or if subtraction of the already entered number has to be
        * performed with the upcoming number which will be entered on the screen*/
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (issubtract == true && istempset == false) {
                        if (num1 != 0) {
                            num2 = Integer.parseInt(result.getText().toString());
                            result.setText(num1 - num2 + "");
                            num1 = num1 - num2;
                            if (num1 > 9999999 || num1 < -9999999) {
                                throw new Exception("");
                            }
                            num2 = 0;
                            istempset = true;
                        } else {
                            num1 = Integer.parseInt(result.getText().toString());
                            num1 = -num1;
                            if (num1 > 9999999 || num1 < -9999999) {
                                throw new Exception("");
                            }
                            result.setText(num1 + "");
                            num2 = 0;
                            istempset = true;
                        }
                    } else if (issubtract == true && istempset == true) {
                        //do nothing
                    } else {
                        if (num1 != 0 && isadd == true && istempset == false) {
                            num1 = num1 + Integer.parseInt(result.getText().toString());
                            if (num1 > 9999999 || num1 < -9999999) {
                                throw new Exception("");
                            }
                            result.setText(num1 + "");
                        } else if (!result.getText().equals(null) && !result.getText().equals("")) {
                            num1 = Integer.parseInt(result.getText().toString());
                        }
                        issubtract = true;
                        isadd = false;
                        istempset = true;
                    }
                    issubtract = true;
                    isadd = false;
                } catch (Exception e) {
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    zero.setEnabled(false);
                    add.setEnabled(false);
                    subtract.setEnabled(false);
                    equal.setEnabled(false);
                    result.setText("Number too large!");
                }
            }
        });

        /*This is an on click listener for "C" button to clear all the data on the display text
        * on the calculator screen and flushing all the values in the memory so that all the
        * operations can be performed freshly*/
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("0");
                num1 = 0;
                num2 = 0;
                issubtract = false;
                isadd = false;
                istempset = false;
                one.setEnabled(true);
                two.setEnabled(true);
                three.setEnabled(true);
                four.setEnabled(true);
                five.setEnabled(true);
                six.setEnabled(true);
                seven.setEnabled(true);
                eight.setEnabled(true);
                nine.setEnabled(true);
                zero.setEnabled(true);
                add.setEnabled(true);
                subtract.setEnabled(true);
                equal.setEnabled(true);
            }
        });

        /*This is an on click listener for "=" button. This provides the result for the addition
        * and subtraction of numbers entered before pressing "=" button. The result is displayed
        * on the display text or text view on the calculator screen.*/
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (!result.getText().equals(null) && !result.getText().equals("")) {
                        num2 = Integer.parseInt(result.getText().toString());
                        if (isadd == true) {
                            if (istempset == false) {
                                if ((num1 + num2) > 9999999 || (num1 + num2) < -9999999) {
                                    throw new Exception("");
                                }
                                result.setText(num1 + num2 + "");
                            } else {
                                result.setText(num1 + "");
                            }
                            isadd = false;
                        } else if (issubtract == true) {
                            if (istempset == false) {
                                if ((num1 - num2) > 9999999 || (num1 - num2) < -9999999) {
                                    throw new Exception("");
                                }
                                result.setText(num1 - num2 + "");
                            } else {
                                result.setText(num1 + "");
                            }
                            issubtract = false;
                        }
                        num1 = 0;
                        num2 = 0;
                    } else if (num1 != 0) {
                        result.setText(num1 + "");
                        isadd = false;
                        issubtract = false;
                        istempset = false;
                    } else if (num2 != 0) {
                        result.setText(num2 + "");
                        isadd = false;
                        issubtract = false;
                        istempset = false;
                    }
                    isadd = false;
                    issubtract = false;
                    isequal=true;
                } catch (Exception e) {
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                    zero.setEnabled(false);
                    add.setEnabled(false);
                    subtract.setEnabled(false);
                    equal.setEnabled(false);
                    result.setText("Number too large!");
                }
            }
        });

    }

    /*not used, do not change*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculate, menu);
        return true;
    }

    /*not used, do not change*/
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
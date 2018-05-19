/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.user.justjava;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int numberOfCoffees = 0;
    String symbol = "$";
    int rate = 5;
    int price = numberOfCoffees * rate;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */

    public void submitOrder(View view) {
//        displayMessage("free");
//        display(numberOfCoffees);
   //     displayPrice(numberOfCoffees * rate);
       displayPrice(numberOfCoffees * rate);

        displayMessage(symbol + " " + (numberOfCoffees * rate) +  " \n Thank You!");

    }

    public void increment(View view) {
        numberOfCoffees = numberOfCoffees + 1;
        display(numberOfCoffees);
        displayPrice(numberOfCoffees * rate);

    }

    public void decrement(View view) {


        numberOfCoffees = numberOfCoffees - 1;
        display(numberOfCoffees);
        displayPrice(numberOfCoffees * rate);

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setText(message);
    }

}

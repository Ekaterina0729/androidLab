package com.example.lab11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /**
     * This method finds the maximum
     * @param arr array containing integer data in which to find the maximum
     * @return maximum array
     */
    public static int Max(int[] arr){
        int maximum = -100000;
        for (int j : arr) {
            if (maximum < j) {
                maximum = j;
            }
        }
        return maximum;
    }

    /**
     * This method finds the minimum
     * @param arr array containing integer data in which to find the minimum
     * @return minimum array
     */
    public static int Min(int[] arr){
        int minimum = 100000;
        for (int j : arr) {
            if (minimum > j) {
                minimum = j;
            }
        }
        return minimum;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
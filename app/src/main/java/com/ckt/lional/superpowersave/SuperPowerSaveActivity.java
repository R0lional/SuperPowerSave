package com.ckt.lional.superpowersave;

import android.annotation.SuppressLint;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class SuperPowerSaveActivity extends FragmentActivity {
    private TextView mDateText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_super_power_save);

        mDateText = (TextView) findViewById(R.id.date_text);
        mDateText.setText(DateFormat.format("MMMM dd, EEEE",
                Calendar.getInstance().getTimeInMillis()));

        CallFragment callFragment = new CallFragment();
        MessageFragement messageFragment = new MessageFragement();
        ContactFragment contactFragment = new ContactFragment();
        ExitFragment exitFragment = new ExitFragment();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        callFragment.addFragment(fm, fragmentTransaction, R.id.top_fragmentcontainer);
        messageFragment.addFragment(fm, fragmentTransaction, R.id.mid_fragmentcontainer);
        contactFragment.addFragment(fm, fragmentTransaction, R.id.bottom_left_fragmentcontainer);
        exitFragment.addFragment(fm, fragmentTransaction, R.id.bottom_right_fragmentcontainer);

        fragmentTransaction.commit();
    }
}

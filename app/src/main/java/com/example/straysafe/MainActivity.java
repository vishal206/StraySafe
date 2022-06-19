package com.example.straysafe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.straysafe.Add.AddFragment;
import com.example.straysafe.Home.HomeFragment;
import com.example.straysafe.Profile.ProfileFragment;
import com.example.straysafe.Store.StoreFragment;
import com.example.straysafe.Wallet.WalletFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home);
    }
    HomeFragment homeFragment=new HomeFragment();
    StoreFragment storeFragment=new StoreFragment();
    AddFragment addFragment=new AddFragment();
    WalletFragment walletFragment=new WalletFragment();
    ProfileFragment profileFragment=new ProfileFragment();
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();
                return true;

            case R.id.store:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, storeFragment).commit();
                return true;

            case R.id.add:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, addFragment).commit();
                return true;
            case R.id.wallet:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, walletFragment).commit();
                return true;
            case R.id.profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, profileFragment).commit();
                return true;
        }
        return false;
    }
}
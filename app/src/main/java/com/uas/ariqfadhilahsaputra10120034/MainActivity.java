/**
 *
 * Nim : 10120034
 * Kelas : IF1
 * Nama : Ariq Fadhilah Saputra
 * Email : ariqfadhilah88@gmail.com
 *
 */
package com.uas.ariqfadhilahsaputra10120034;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseUser;
import com.uas.ariqfadhilahsaputra10120034.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private FirebaseUser firebaseUser;
    private TextView textName;
    private Button btnLogout;

    private ActivityMainBinding binding;

    @SuppressLint({"SetTextI18n",})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);





    }



}
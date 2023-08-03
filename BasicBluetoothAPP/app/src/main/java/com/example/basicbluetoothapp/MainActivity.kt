package com.example.basicbluetoothapp

import android.app.Activity
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothManager
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.basicbluetoothapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var bluetoothAdapter: BluetoothAdapter
    private lateinit var bluetoothManager: BluetoothManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        bluetoothManager = getSystemService(Cont)
        enableDisableBT()

        binding.btnvisible.setOnClickListener {

        }

    }

    private fun enableDisableBT() {
        when{
            ContextCompat.checkSelfPermission(this, android.Manifest.permission.BLUETOOTH_CONNECT) ==PackageManager.PERMISSION_GRANTED->{

            }
            shouldShowRequestPermissionRationale(android.Manifest.permission.BLUETOOTH_CONNECT)->{
                ActivityCompat.requestPermissions(this,arrayOf(android.Manifest.permission.BLUETOOTH_CONNECT),101)
            }
        }
        binding.btnonoff.setOnClickListener {

        }

    }

}
package com.A1_215IC.inzynieriaprojekt

/*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.content.pm.PackageManager
import android.Manifest
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.zxing.Result
import me.dm7.barcodescanner.zxing.ZXingScannerView

class MainActivity : AppCompatActivity(), ZXingScannerView.ResultHandler {

    private lateinit var barcodeTextView: TextView
    private lateinit var scanButton: Button
    private lateinit var manualButton: Button
    private lateinit var barcodeEditText: EditText
    private lateinit var scannerView: ZXingScannerView
    private val CAMERA_PERMISSION_REQUEST_CODE = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        barcodeTextView = findViewById(R.id.barcode_text_view)
        scanButton = findViewById(R.id.scan_button)
        manualButton = findViewById(R.id.manual_button)
        barcodeEditText = findViewById(R.id.barcode_edit_text)
        scannerView = ZXingScannerView(this)

        scanButton.setOnClickListener {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED) {
                // Kamera jest dostępna, uruchamiamy skanowanie kodu kreskowego
                setContentView(scannerView)
                scannerView.setResultHandler(this)
                scannerView.startCamera()
            } else {
                // Brak uprawnień do korzystania z kamery, wyświetlamy prośbę o ich udostępnienie
                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA), CAMERA_PERMISSION_REQUEST_CODE)
            }
        }

        manualButton.setOnClickListener {
            val barcode = barcodeEditText.text.toString()
            if (barcode.isEmpty()) {
                Toast.makeText(this, "Wprowadź kod kreskowy", Toast.LENGTH_SHORT).show()
            } else {
                barcodeTextView.text = barcode
            }
        }
    }

    override fun handleResult(result: Result?) {
        // Obsługa wyniku skanowania kodu kreskowego
        if (result != null) {
            barcodeTextView.text = result.text
            scannerView.stopCamera()
            setContentView(R.layout.activity_main)
        }
    }

    override fun onPause() {
        super.onPause()
        scannerView.stopCamera()
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        // Obsługa prośby o udostępnienie uprawnień do korzystania z kamery
        if (requestCode == CAMERA_PERMISSION_REQUEST_CODE) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Uprawnienia zostały udostępnione, uruchamiamy skanowanie kodu kreskowego
                setContentView(scannerView)
                scannerView.setResultHandler(this)
                scannerView.startCamera()
            } else {
                // Uprawnienia nie zostały udostępnione, informujemy użytkownika o tym
                Toast.makeText(this, "Brak uprawnień do korzystania z kamery", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
*/
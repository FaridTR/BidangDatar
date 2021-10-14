package xyz.farid.bidangdatar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Segitiga extends Activity {
    private EditText txtAlas;
    private EditText txtTinggi;
    private EditText txtLuas;
    private EditText txtSisiA;
    private EditText txtSisiB;
    private EditText txtSisiC;
    private EditText txtKeliling;
    private Button btnLuas;
    private Button btnKeliling;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.segitiga);
        txtAlas = (EditText) findViewById(R.id.txtAlas);
        txtTinggi = (EditText) findViewById(R.id.txtTinggi);
        txtLuas = (EditText) findViewById(R.id.txtLuas);
        btnLuas = (Button) findViewById(R.id.btnLuas);
        txtSisiA = (EditText) findViewById(R.id.txtSisiA);
        txtSisiB = (EditText) findViewById(R.id.txtSisiB);
        txtSisiC = (EditText) findViewById(R.id.txtSisiC);
        txtKeliling = (EditText) findViewById(R.id.txtKeliling);
        btnKeliling = (Button) findViewById(R.id.btnKeliling);

    }
    
    public void hitungLuas(View view) {
        try {

            int alas = Integer.parseInt(txtAlas.getText().toString());
            int tinggi = Integer.parseInt(txtTinggi.getText().toString());
            int luas = (alas * tinggi) / 2;
            txtLuas.setText(String.valueOf(luas));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void hitungKeliling(View view) {
        try {

            int sisiA = Integer.parseInt(txtSisiA.getText().toString());
            int sisiB = Integer.parseInt(txtSisiB.getText().toString());
            int sisiC = Integer.parseInt(txtSisiC.getText().toString());
            int keliling = (sisiA + sisiB + sisiC);
            txtKeliling.setText(String.valueOf(keliling));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void backtoMenu(View view){
        finish();
    }
}
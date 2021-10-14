package xyz.farid.bidangdatar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PersegiPanjang extends Activity {
    private EditText txtPanjang;
    private EditText txtLebar;
    private EditText txtLuas;
    private EditText txtKeliling;
    private Button btnLuas;
    private Button btnKeliling;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegipanjang);
        txtPanjang = (EditText) findViewById(R.id.txtPanjang);
        txtLebar = (EditText) findViewById(R.id.txtLebar);
        txtLuas = (EditText) findViewById(R.id.txtLuas);
        txtKeliling= (EditText) findViewById(R.id.txtKeliling);
        btnLuas = (Button) findViewById(R.id.btnLuas);
        btnKeliling = (Button) findViewById(R.id.btnKeliling);

    }

    public void hitungLuas(View view) {
        try {

            int panjang = Integer.parseInt(txtPanjang.getText().toString());
            int lebar = Integer.parseInt(txtLebar.getText().toString());
            int luas = panjang * lebar;
            txtLuas.setText(String.valueOf(luas));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void hitungKeliling(View view) {
        try {

            int panjang = Integer.parseInt(txtPanjang.getText().toString());
            int lebar = Integer.parseInt(txtLebar.getText().toString());
            int luas = 2 * panjang + 2 * lebar;
            txtKeliling.setText(String.valueOf(luas));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void backtoMenu(View view){
        finish();
    }
}
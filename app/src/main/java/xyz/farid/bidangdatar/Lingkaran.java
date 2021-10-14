package xyz.farid.bidangdatar;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Lingkaran extends Activity {
    private EditText txtJari;
    private EditText txtLuas;
    private EditText txtKeliling;
    private Button btnLuas;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.lingkaran);
        txtJari = (EditText) findViewById(R.id.txtJari);
        txtLuas = (EditText) findViewById(R.id.txtLuas);
        btnLuas = (Button) findViewById(R.id.btnHitung);
        txtKeliling = (EditText) findViewById(R.id.txtKeliling);

    }

    public void hitungLuas(View view) {
        try {

            int jarijari = Integer.parseInt(txtJari.getText().toString());
            double phi = 3.14;
            double luas =  phi * jarijari * jarijari;
            txtLuas.setText(String.valueOf(luas));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void hitungKeliling(View view) {
        try {

            int jarijari = Integer.parseInt(txtJari.getText().toString());
            double phi = 3.14;
            double keliling =  2 * phi * jarijari;
            txtKeliling.setText(String.valueOf(keliling));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void backtoMenu(View view){
        finish();
    }
}

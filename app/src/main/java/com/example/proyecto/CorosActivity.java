package com.example.proyecto;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;

public class CorosActivity extends AppCompatActivity {

    private EditText ettituloc, etautorc, etletrac;
    private Button btnRegistrarc;
    private AsyncHttpClient clientec = new AsyncHttpClient();
    private ListView lvdatosc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coros);

        ettituloc = findViewById(R.id.ettituloc);
        etautorc = findViewById(R.id.etautorc);
        etletrac = findViewById(R.id.etletrac);

        btnRegistrarc = findViewById(R.id.btnRegistrarC);

        lvdatosc = findViewById(R.id.lvDatosRc);

        clientec = new AsyncHttpClient();

        almacenarCoros();
    }


    private void almacenarCoros() {
        btnRegistrarc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ettituloc.getText().toString().length()== 0 )  {
                    ettituloc.setError("Campo Obligatorio");
                }else if (etautorc.getText().toString().length()== 0){
                    etautorc.setError("Campo Obligatorio");
                }else  if (etletrac.getText().toString().length()== 0){
                    etletrac.setError("Campo Obligatorio");
                }else{
                }
            }
        });
    }


    private  void agregarCoros(Coros a){
        String url = "https://proyectoandroidstudio.000webhostapp.com/agregarcoro.php?";
        String parametros = "titulo="+a.getTitulo()+"&autor="+a.getAutor()+"&letra="+a.getLetra();
        clientec.post(url + parametros, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200){
                    Toast.makeText(CorosActivity.this, "Coro agregado correctamente", Toast.LENGTH_SHORT).show();
                    ettituloc.setText("");
                    etautorc.setText("");
                    etletrac.setText("");
                }else if (statusCode != 200){
                    Toast.makeText(CorosActivity.this, "Coro no se pudo agregar", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });
    }

}

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
                    Coros a = new Coros();
                    a.setTitulo(ettituloc.getText().toString().replaceAll(" ", "%20"));
                    a.setAutor(etautorc.getText().toString().replaceAll(" ", "%20"));
                    a.setLetra(etletrac.getText().toString().replaceAll(" ", "%20"));

                    agregarCoros(a);

                    //obtenerAlabanzas();
                }
            }
        });
    }


    private  void agregarCoros(Coros a){
        String url = "https://proyectoandroidstudio.000webhostapp.com/agregarcoro.php?";
        String parametros = "titulo="+a.getTitulo()+"&autor="+a.getAutor()+"&letra="+a.getLetra();
        clientec.post(url + parametros, new AsyncHttpResponseHandler() {
            @Override

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });
    }

}

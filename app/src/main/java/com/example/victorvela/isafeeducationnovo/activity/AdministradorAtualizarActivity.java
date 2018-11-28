package com.example.victorvela.isafeeducationnovo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.victorvela.isafeeducationnovo.R;
import com.example.victorvela.isafeeducationnovo.model.Administrador;
import com.example.victorvela.isafeeducationnovo.repository.AdministradorRepository;
import com.example.victorvela.isafeeducationnovo.repository.Repository;

public class AdministradorAtualizarActivity extends AppCompatActivity {

    private EditText editIdAdministrador, editNomeAdministrador, editSenhaAdministrador;
    private Repository repository;
    private Administrador administrador;
    private AdministradorRepository administradorRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrador_atualizar);

        /**
         * receber idm nome e senha da tela de atualizar
         */
        editIdAdministrador = findViewById(R.id.edit_id);
        editNomeAdministrador = findViewById(R.id.edit_nomeDisciplina);
        editSenhaAdministrador = findViewById(R.id.edit_senhaAdministrador);

        administrador = new Administrador();
        administradorRepository = new AdministradorRepository(getApplicationContext());

    }

    public void atualizarAdministrador(View view){
        //não esta atualizando ainda
        Toast.makeText(this, administrador.getNomeAdministrador(), Toast.LENGTH_SHORT).show();

    }

    public void teste(View view){
        Toast.makeText(this, administrador.getId() + " " + administrador.getNomeAdministrador() + " " + administrador.getSenhaAdministrador(), Toast.LENGTH_SHORT).show();
    }
}

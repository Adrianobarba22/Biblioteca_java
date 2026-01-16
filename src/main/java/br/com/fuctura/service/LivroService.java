package br.com.fuctura.service;


import br.com.fuctura.dao.LivroDao;
import br.com.fuctura.domain.Livro;

import java.sql.SQLException;

public class LivroService {
    public void cadastrar(String titulo) throws SQLException {

        LivroDao dao = new LivroDao();

        Livro livro = new Livro();
        livro.setTitulo(titulo);

        dao.cadastrar( livro );
    }
}


package br.com.fuctura.dao;

import br.com.fuctura.domain.Autor;
import br.com.fuctura.infrastructure.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class AutorDao {

    public void cadastrar(Autor autor) throws SQLException {
        //insert into autor (nome) values ('Denis');
        ConnectionFactory fabrica = new ConnectionFactory();
        Connection conexao = fabrica.getConnection();

        String comandoSQL = "";

    }

}
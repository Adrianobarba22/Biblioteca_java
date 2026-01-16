package br.com.fuctura.dao;

import br.com.fuctura.domain.Livro;
import br.com.fuctura.infrastructure.ConnectionFactory;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class LivroDao {

    public void cadastrar(Livro livro) throws SQLException {

        ConnectionFactory fabrica = new ConnectionFactory();

        Connection conexao = fabrica.getConnection();

        String comandoSQL = "insert into livro (titulo) values (?)";

        PreparedStatement stm = conexao.prepareStatement(comandoSQL);

        stm.setString(1, livro.getTitulo());

        stm.execute();
    }
}

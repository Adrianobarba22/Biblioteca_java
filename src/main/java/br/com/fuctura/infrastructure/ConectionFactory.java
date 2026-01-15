package br.com.fuctura.infrastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionFactory {

    public Connection getConnection(){
         String url = "jdbc:postgresql://localhost:5432/curso_db";
         String password = "postgres";
         String user = "postgres";
        try {
            Connection c = DriverManager.getConnection(url, password, user);
            System.out.println("Conectado ao PostgresSQL com sucesso!");
            return c;
        }catch (SQLException e) {
            System.out.println("Erro ao conectar no banco de dados");
            e.printStackTrace();
        }
        return null;
    }
}

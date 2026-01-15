package br.com.fuctura;

import br.com.fuctura.infrastructure.ConectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Aplicacao {
    public static void main(String[] args) {
        Connection c = new ConectionFactory().getConnection();
    }
}
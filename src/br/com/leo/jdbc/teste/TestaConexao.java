package br.com.leo.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.leo.jdbc.ConnectionFactory;

public class TestaConexao {
	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão aberta!");
		connection.close();
	}
}

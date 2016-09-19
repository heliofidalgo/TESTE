package br.com.caelum.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.caelum.jdbc.ConnectionFactory;

public class TestaConexao {


	public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão Aberta!");
		connection.close();
	}

}
/*
*link da apostila para estudo de desenvolvimento web com foco em JAVAWEB
*  https://www.caelum.com.br/apostila-java-web/
*  OBS: configurar o MySQL para uso neste estudo.
*/
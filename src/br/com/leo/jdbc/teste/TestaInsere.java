package br.com.leo.jdbc.teste;

import java.util.Calendar;

import br.com.leo.jdbc.dao.ContatoDAO;
import br.com.leo.jdbc.modelo.Contato;

public class TestaInsere {
	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Leo");
		contato.setEmail("leo@email.com");
		contato.setEndereco("Rua Teste");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDAO dao = new ContatoDAO();
		
		dao.adiciona(contato);
		
		System.out.println("Gravado!");
	}
}

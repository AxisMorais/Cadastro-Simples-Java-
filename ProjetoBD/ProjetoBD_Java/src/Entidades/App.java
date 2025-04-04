package Entidades;

import java.util.Scanner;

import DAO.UsuarioDAO;

public class App {
	
	public static void main(String[] args) {
		
			
	  Scanner entrada = new Scanner (System.in);
	  	    
	   Usuario objetoUsuario = new Usuario();
	 
	   
	   System.out.println("Informe o nome");
	   String nome = entrada.nextLine();
	   objetoUsuario.setNome(nome);
  	   

	   System.out.println("Informe o Endereco");
	   String endereco = entrada.nextLine();
	   objetoUsuario.setEndereco(endereco);  	   
	  
	   new UsuarioDAO().cadastrarUsuario(objetoUsuario);	
	
	}

}

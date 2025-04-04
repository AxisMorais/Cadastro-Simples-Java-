package DAO;

import java.lang.reflect.Parameter;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Entidades.Usuario;
import conexao.Conexao;

//DAO- Data access object - objeto de acesso a dados
//contém metodos que fazem conexão com o banco de dados
public class UsuarioDAO {

	public void cadastrarUsuario(Usuario usuario) {
		
		String sql= "INSERT INTO USUARIO (NOME_USUARIO, ENDERECO)VALUES(?,?)";
		
		PreparedStatement ps = null;
		
		try {
			
			//Retornar aqui caso houver algum problema tempo 15:24  do vídeo
			ps = Conexao.getConexao().prepareStatement(sql);
			ps.setString(1,usuario.getNome());
			ps.setString(2,usuario.getEndereco());
			
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}

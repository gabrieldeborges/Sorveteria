package PacoteJarel;
/**
 *
 * @author Jackarrys
 */
import java.sql.*;
import java.util.*;

public class CadastroDAO 
{
    private Connection conexao;   
    
    public CadastroDAO(Connection conexao)
    {
       setConexao(conexao);
    }
    public Connection getConexao() {
        return conexao;
    }

    public void setConexao(Connection conexao) {
        this.conexao = conexao;
    }
   public String inserirCliente(CadastroBean cadastro)
   {
       String sql = "insert into clientes values(0,?,?,?,?,?,?,?)";
       try
       {
           PreparedStatement ps = getConexao().prepareStatement(sql);
           ps.setString(1, cadastro.getNome());
           ps.setString(2, cadastro.getSexo());
           ps.setString(3, cadastro.getEndereco());
           ps.setString(4, cadastro.getCidade());
           ps.setString(5, cadastro.getCpf());
           ps.setString(6, cadastro.getEmail());
           ps.setString(7, cadastro.getSenha());
           
           if(ps.executeUpdate()>0)
           {
               return "Cadastrado com Sucesso";
           }
           else
           {
               return "Erro ao cadastrar";
           }

       }
       catch(SQLException e)
       {
           return e.getMessage();
       }       
   }  
    
   /*public String alterar(CadastroBean cadastro){
       String sql = "update clientes 
   }*/
    
}

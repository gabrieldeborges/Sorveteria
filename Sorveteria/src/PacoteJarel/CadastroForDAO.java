/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteJarel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author manager
 */
public class CadastroForDAO 
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
    public String inserirFunc(CadastroBean cadastro)
   {
       String sql = "insert into clientes values(0,?,?,?,?,?,?,?,?)";
       try
       {
           PreparedStatement ps = getConexao().prepareStatement(sql);
           ps.setString(1, cadastro.getNome());
           ps.setString(2, cadastro.getEndereco());
           ps.setString(3, cadastro.getSalario());
           ps.setString(4, cadastro.getSexo());
           ps.setString(5, cadastro.getCpf());
           ps.setString(6, cadastro.getEmail());
           ps.setString(7, cadastro.getCidade());
           
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
}

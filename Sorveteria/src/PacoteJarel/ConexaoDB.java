
package PacoteJarel;

import java.sql.*;


/**
 *
 * @author manager
 */
public class ConexaoDB 
{
    public static Connection abrirConexao()
    {
        Connection conexao = null;
        try
        {
            Class.forName("com.mysql.jdbc.Drive").newInstance();
            
            String url= "jdbc:mysql://127.0.0.1/sorveteria?";
            url+= "user=root&password=";
            
            conexao=DriverManager.getConnection(url); 
        }
        catch(SQLException e)
        {
            System.out.print("Erro ");
            System.out.println(e.getMessage());
        }
        catch(ClassNotFoundException e)
        {
            System.out.print("Erro ");
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.out.print("Erro ");
            System.out.println(e.getMessage());
        }
        return conexao;
    }
         
    public static void fecharConexao(Connection conexao)
    {
        try
        {
            conexao.close();
            System.out.println("Conexão encerrada");
        }
        catch(SQLException e)
        {
            System.out.print("Erro ");
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.out.print("Erro ");
            System.out.println(e.getMessage());
        }
        
    }
}

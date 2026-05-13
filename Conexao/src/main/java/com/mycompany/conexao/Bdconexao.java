package com.mycompany.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Bdconexao {
    
    private static final String URL = "jdbc:mysql://localhost:3307";
    private static final String USUARIO = "root";
    private static final String SENHA = "catolica";
    
    public Connection obterConexao () throws Exception {
        try {
            Class.forName ("com.mysql.cj.jdbc.Driver");
            
            Connection conexao = DriverManager.getConnection (URL,USUARIO,SENHA);
            System.out.println ("Conexão estabelecida");
            return conexao;
        }catch (ClassNotFoundException e){
            throw new Exception ("Dirver não encotrador"+ e.getMessage()); 
        }catch (SQLException e){
            throw new Exception ("Erro ao conectar ao banco de dados: "+ e.getMessage());
        }catch (Exception e){
            throw new Exception ("");
        }    
    }
}

package com.mycompany.conexao;
import java.sql.Connection;


public class Principal {

    public static void main(String[] args) {
       Bdconexao banco = new Bdconexao();
       Connection Conexao = null;
       try{
           Conexao = (Connection) banco.obterConexao();
       } catch (Exception e ){
           System.out.println (e.getMessage());
       }
    }
}

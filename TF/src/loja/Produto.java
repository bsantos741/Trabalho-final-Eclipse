package loja;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Produto{
    private int cod_Produto;
    private String nomeProduto; 
    private double preçoProduto;
    private String categoria;
    
    private Connection conexao;
    
    public Produto(Connection conexao){
        this.conexao = conexao;
    }
    //Criar produto
    public boolean create(String nome, int cod, double preço, String setor){
        nomeProduto = nome;
        cod_Produto = cod;
        preçoProduto = preço;
        categoria = setor;
        try{
            Statement statement = this.conexao.createStatement();
            statement.executeUpdate("INSERT INTO Produto VALUES('"+nome+"', "+cod+", "+preço+", "+setor+")");
            
            System.out.println(nome+" - "+cod+ "adicionado(a)");
            return true;
            
        }catch(SQLException e){
            return false;
        }
    }
    public void consultaEstoque(String nome, int cod){
        //consultar banco de dados SQL//
        //retonar quantidades antes e depois da venda//
    }
}
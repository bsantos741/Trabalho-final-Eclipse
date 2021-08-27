package loja;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Produto{
	private Connection conexao;
    public Produto(Connection conexao){
        this.conexao = conexao;

    }
    //Criar produto
    public boolean adicionarNovoProduto(String nome, int cod, double preço, String setor, int quantidade){
        try{
            Statement statement = this.conexao.createStatement();
            statement.executeUpdate("INSERT INTO Produto VALUES("+cod+", '"+nome+"', '"+setor+"', "+preço+", "+quantidade+")");
            
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
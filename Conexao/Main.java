package Conexao;

import Conexao.TestConexaoSqlite3;
import Conexao.Crud;
import java.sql.Statement;
import java.sql.SQLException;

public class Main{
    public static void main(String args[])throws Exception{
        TestConexaoSqlite3 conexao = new TestConexaoSqlite3();
        conexao.abrirConexao();
        Crud crud = new Crud(conexao.getConnection());
        
        //Inserindo cadastros no banco
        //System.out.println(crud.create(1234567896, "Maria de Fátima"));
        //crud.create(1234567891, "Ismayle Santos");
        //crud.create(1234567892, "Maria Ferreira");
        //crud.create(1234567893, "Santos Sousa");
        //crud.create(1234567894, "Maria Pinheiro");
        
        //Consultando uma linha no banco 
        //crud.read(1234567892);
        
        
        //Alterando um registro no banco
        //crud.update(1234567895, "Novo Nome");
        
        //Deletando um registro no banco
        crud.delete(1234567895);
        
        //boolean resposta;
        //resposta = crud.create(1234567891, "Fátima Pinheiro");
        //System.out.println(resposta);
    
        
        
        conexao.fecharConexao();     
        
        
    }
}
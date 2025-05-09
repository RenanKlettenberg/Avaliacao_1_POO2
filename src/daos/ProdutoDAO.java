/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import Utils.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import models.Produto;

/**
 *
 * @author 12252665998
 */
public class ProdutoDAO {
    public static Produto salvar(Produto p){
        //acessa banco de dados
        try{                   
          String sql = "insert into tb_produto(nome, tipo)values(?,?)";
          PreparedStatement stm = Conexao.getConexao()
                  .prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
          stm.setString(1, p.getNome());
          stm.setString(2, p.getTipo());
          
          int linhas = stm.executeUpdate();
          if(linhas > 0){
              ResultSet rs = stm.getGeneratedKeys();
              if(rs.next())
                p.setId(rs.getInt(1));
          }                            
        }catch(SQLException ex){
            throw new RuntimeException(ex.getMessage());
        }  
        finally{
            Conexao.fecharConexao();
        }
        return p;
    }
}

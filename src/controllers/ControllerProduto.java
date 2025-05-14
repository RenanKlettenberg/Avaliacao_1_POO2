/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;


import daos.ProdutoDAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import models.Produto;

/**
 *
 * @author 12252665998
 */
public class ControllerProduto {
    
    
    public void cadastrar(String nome, String tipo,String quantidadeT, String precoT){
        //processar regras de negocio
        //Produto retorno = DaoProduto.salvar(cliente);
        //return cliente;
        double preco=Double.parseDouble(precoT);
        int quantidade=Integer.parseInt(quantidadeT);
        Produto p=new Produto(nome, preco, tipo, quantidade);
        ProdutoDAO daoP=new ProdutoDAO();
        
        EntityManagerFactory emf =Persistence.createEntityManagerFactory("Avaliacao_1_POO2PU");
       
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        
        //daoP.salvar(p);
    }
    
   
}

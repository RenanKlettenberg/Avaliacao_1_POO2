/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import models.Produto;

/**
 *
 * @author 12252665998
 */
public class ProdutoDAO {
    public static Produto salvar(Produto p){
        //acessa banco de dados
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AulaJpaManyToManyPU");
        
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
         
        return p;
    }
}

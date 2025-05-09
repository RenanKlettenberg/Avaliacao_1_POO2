/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import models.Produto;

/**
 *
 * @author 12252665998
 */
public class ControllerProduto {
    
    
    
    public boolean cadastrar(String nome, String tipo,String quantidadeT, String precoT){
        double preco=Double.parseDouble(precoT);
        int quantidade=Integer.parseInt(quantidadeT);
        Produto p=new Produto(nome, preco, tipo, quantidade);
        System.out.println(p.toString());
        
        return true;
    }
}

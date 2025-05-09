package controllers;

import daos.ClienteDAO;
import models.Cliente;

public class ControllerCliente {
    
    private ClienteDAO dao;
    
    public ControllerCliente(){
        this.dao = new ClienteDAO();
    }
    
    public boolean cadastrar(String nome, String telefone, String cpf) {
        Cliente c = new Cliente(nome,cpf,telefone);
        return dao.cadastrar(c);
    }
    
}

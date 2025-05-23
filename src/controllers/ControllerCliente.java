package controllers;

import daos.ClienteDAO;
import java.util.ArrayList;
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
    
    public boolean editar(String nome, String telefone, String cpf){
        Cliente c = new Cliente(nome,cpf,telefone);
        return dao.editar(c);
    }
    
    public void edicao(Cliente clienteSelecionado){
        //Leva para a tela e carrega 
    }

    public ArrayList<Cliente> getAll() {
        return null;
    }

    public void deletar(Cliente clienteSelecionado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void criacao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

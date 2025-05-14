package daos;

import models.Cliente;

public class ClienteDAO {

    public boolean cadastrar(Cliente c) {
        System.out.println(c.getNome());
        return true;
    }

    public boolean editar(Cliente c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

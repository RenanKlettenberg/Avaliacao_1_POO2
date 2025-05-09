package daos;

import models.Cliente;

public class ClienteDAO {

    public boolean cadastrar(Cliente c) {
        System.out.println(c.getNome());
        return true;
    }
    
}

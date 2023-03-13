
package com.campana_backend.campana_backend.services;

import com.campana_backend.campana_backend.models.Cliente;
import com.campana_backend.campana_backend.repository.ClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    
    public List<Cliente> getClienteByCedula(String cedula){
        List<Cliente> cliente = clienteRepository.findByCedula(cedula);
        
        return (cliente == null || cliente.isEmpty())?null:cliente;
    }

}

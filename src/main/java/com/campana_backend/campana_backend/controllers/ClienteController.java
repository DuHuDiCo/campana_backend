
package com.campana_backend.campana_backend.controllers;

import com.campana_backend.campana_backend.models.Cliente;
import com.campana_backend.campana_backend.services.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:4200/", "http://almacenelectrohogar.com/", "https://pagafacil.almacenelectrohogar.com/","http://192.168.1.171:9000/"})
@RequestMapping("/api/v1/cliente")
@RestController
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;
    
    
    @GetMapping("/{cedula}")
    public ResponseEntity<List<Cliente>> getClienteByCedula(@PathVariable("cedula") String cedula ){
        
        List<Cliente> cliente = clienteService.getClienteByCedula(cedula);
        
        return(cliente == null|| cliente.isEmpty())?ResponseEntity.noContent().build():ResponseEntity.ok(cliente);
    }
    

}



package com.campana_backend.campana_backend.repository;



import com.campana_backend.campana_backend.models.Cliente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    
    
    List<Cliente> findByCedula(String cedula);
    
    

}

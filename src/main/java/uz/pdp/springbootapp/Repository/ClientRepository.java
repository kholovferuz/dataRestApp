package uz.pdp.springbootapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springbootapp.Entity.Client;
import uz.pdp.springbootapp.Projection.ClientProjection;

@RepositoryRestResource(path = "client",  excerptProjection = ClientProjection.class)
public interface ClientRepository extends JpaRepository<Client, Integer> {

}

package uz.pdp.springbootapp.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.springbootapp.Entity.Client;
import uz.pdp.springbootapp.Projection.ClientProjection;

@RepositoryRestResource(path = "client",  excerptProjection = ClientProjection.class)
public interface ClientRepository extends JpaRepository<Client, Integer> {

    @RestResource(path = "sortByName")
    Page<Client> findAllByName(@Param("name") String name, Pageable pageable);
}

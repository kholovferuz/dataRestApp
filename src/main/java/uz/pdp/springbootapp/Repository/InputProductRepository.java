package uz.pdp.springbootapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springbootapp.Entity.InputProduct;
import uz.pdp.springbootapp.Projection.InputProductProjection;

@RepositoryRestResource(path = "inputProduct", excerptProjection = InputProductProjection.class)
public interface InputProductRepository extends JpaRepository<InputProduct, Integer> {

}

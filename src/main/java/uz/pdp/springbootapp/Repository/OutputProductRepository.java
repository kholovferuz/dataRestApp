package uz.pdp.springbootapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springbootapp.Entity.OutputProduct;
import uz.pdp.springbootapp.Projection.OutputProductProjection;

@RepositoryRestResource(path = "outputProduct", excerptProjection = OutputProductProjection.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {

}

package uz.pdp.springbootapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springbootapp.Entity.Output;
import uz.pdp.springbootapp.Projection.OutputProjection;


@RepositoryRestResource(path = "output", excerptProjection = OutputProjection.class)
public interface OutputRepository extends JpaRepository<Output, Integer> {

}

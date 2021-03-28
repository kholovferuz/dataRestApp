package uz.pdp.springbootapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springbootapp.Entity.Input;
import uz.pdp.springbootapp.Projection.InputProjection;


@RepositoryRestResource(path = "input", excerptProjection = InputProjection.class)
public interface InputRepository extends JpaRepository<Input, Integer> {

}

package uz.pdp.springbootapp.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.springbootapp.Entity.Output;
import uz.pdp.springbootapp.Entity.Warehouse;
import uz.pdp.springbootapp.Projection.OutputProjection;

import java.sql.Timestamp;

@RepositoryRestResource(path = "output", excerptProjection = OutputProjection.class)
public interface OutputRepository extends JpaRepository<Output, Integer> {
    @RestResource(path = "byDate")
    Page<Output> findAllByDate(@Param("date") Timestamp date, Pageable pageable);
}

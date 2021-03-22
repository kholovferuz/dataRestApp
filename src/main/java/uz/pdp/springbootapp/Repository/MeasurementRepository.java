package uz.pdp.springbootapp.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.springbootapp.Entity.Measurement;
import uz.pdp.springbootapp.Entity.Warehouse;
import uz.pdp.springbootapp.Projection.MeasurementProjection;

@RepositoryRestResource(path = "measurement", excerptProjection = MeasurementProjection.class)
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
    @RestResource(path = "byName")
    Page<Measurement> findAllByName(@Param("name") String name, Pageable pageable);
}

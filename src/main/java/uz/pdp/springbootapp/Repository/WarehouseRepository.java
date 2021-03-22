package uz.pdp.springbootapp.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.springbootapp.Entity.Warehouse;
import uz.pdp.springbootapp.Projection.WarehouseProjection;

@RepositoryRestResource(path = "warehouse", excerptProjection = WarehouseProjection.class)
public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {

    @RestResource(path = "byName")
    Page<Warehouse> findAllByName(@Param("name") String name, Pageable pageable);
}

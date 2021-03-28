package uz.pdp.springbootapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springbootapp.Entity.Warehouse;
import uz.pdp.springbootapp.Projection.WarehouseProjection;

@RepositoryRestResource(path = "warehouse", excerptProjection = WarehouseProjection.class)
public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {

}

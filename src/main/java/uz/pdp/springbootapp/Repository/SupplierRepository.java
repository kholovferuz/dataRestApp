package uz.pdp.springbootapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springbootapp.Entity.Supplier;
import uz.pdp.springbootapp.Projection.SupplierProjection;

@RepositoryRestResource(path = "supplier", excerptProjection = SupplierProjection.class)
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}

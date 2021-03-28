package uz.pdp.springbootapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springbootapp.Entity.Product;
import uz.pdp.springbootapp.Projection.ProductProjection;

@RepositoryRestResource(path = "product", excerptProjection = ProductProjection.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {


}

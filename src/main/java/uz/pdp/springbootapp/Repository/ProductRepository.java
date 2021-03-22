package uz.pdp.springbootapp.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.springbootapp.Entity.Category;
import uz.pdp.springbootapp.Entity.Product;
import uz.pdp.springbootapp.Entity.Warehouse;
import uz.pdp.springbootapp.Projection.ProductProjection;

@RepositoryRestResource(path = "product", excerptProjection = ProductProjection.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @RestResource(path = "byCategory")
    Page<Product> findAllByCategory(@Param("category") Category category, Pageable pageable);

}

package uz.pdp.springbootapp.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.springbootapp.Entity.Category;
import uz.pdp.springbootapp.Entity.Client;
import uz.pdp.springbootapp.Entity.Currency;
import uz.pdp.springbootapp.Projection.CategoryProjection;

@RepositoryRestResource(path = "category", excerptProjection = CategoryProjection.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    @RestResource(path = "byName")
    Page<Category> findAllByName(@Param("name") String name, Pageable pageable);
}

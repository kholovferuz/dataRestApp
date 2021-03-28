package uz.pdp.springbootapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springbootapp.Entity.Category;
import uz.pdp.springbootapp.Projection.CategoryProjection;

@RepositoryRestResource(path = "category", excerptProjection = CategoryProjection.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}

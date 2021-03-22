package uz.pdp.springbootapp.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.springbootapp.Entity.Currency;
import uz.pdp.springbootapp.Entity.InputProduct;
import uz.pdp.springbootapp.Entity.Measurement;
import uz.pdp.springbootapp.Projection.CurrencyProjection;

@RepositoryRestResource(path = "currency", excerptProjection = CurrencyProjection.class)
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {
    @RestResource(path = "byName")
    Page<Currency> findAllByName(@Param("name") String name, Pageable pageable);
}

package uz.pdp.springbootapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springbootapp.Entity.Currency;
import uz.pdp.springbootapp.Projection.CurrencyProjection;


@RepositoryRestResource(path = "currency", excerptProjection = CurrencyProjection.class)
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {

}

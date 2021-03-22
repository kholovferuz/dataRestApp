package uz.pdp.springbootapp.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springbootapp.Entity.Currency;

@Projection(types = Currency.class)
public interface CurrencyProjection {
    Integer getId();

    String getName();

    long getActive();

}

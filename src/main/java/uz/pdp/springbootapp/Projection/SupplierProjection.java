package uz.pdp.springbootapp.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springbootapp.Entity.Supplier;

@Projection(types = Supplier.class)
public interface SupplierProjection {
    Integer getId();

    String getName();

    Boolean getActive();

    String getPhoneNumber();
}

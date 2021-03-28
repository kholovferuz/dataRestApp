package uz.pdp.springbootapp.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springbootapp.Entity.Warehouse;

@Projection(types = Warehouse.class)
public interface WarehouseProjection {
    Integer getId();

    String getName();

    Boolean getActive();

}

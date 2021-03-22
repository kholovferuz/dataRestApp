package uz.pdp.springbootapp.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springbootapp.Entity.Currency;
import uz.pdp.springbootapp.Entity.Input;
import uz.pdp.springbootapp.Entity.Supplier;
import uz.pdp.springbootapp.Entity.Warehouse;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface InputProjection {
    Integer getId();

    Timestamp getDate();

    String getInvoiceNumber();

    String getCode();

    Warehouse getWarehouse();

    Supplier getSupplier();

    Currency getCurrency();
}

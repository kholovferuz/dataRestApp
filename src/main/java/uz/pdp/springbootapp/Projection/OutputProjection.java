package uz.pdp.springbootapp.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springbootapp.Entity.*;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface OutputProjection {
    Integer getId();

    Timestamp getDate();

    String getInvoiceNumber();

    String getCode();

    Warehouse getWarehouse();

    Client getClient();

    Currency getCurrency();
}

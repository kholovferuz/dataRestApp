package uz.pdp.springbootapp.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springbootapp.Entity.Input;
import uz.pdp.springbootapp.Entity.OutputProduct;
import uz.pdp.springbootapp.Entity.Product;

import java.util.Date;

@Projection(types = OutputProduct.class)
public interface OutputProductProjection {

    Integer getId();

    Double getAmount();

    Double getPrice();

    Input getOutput();

    Product getProduct();
}

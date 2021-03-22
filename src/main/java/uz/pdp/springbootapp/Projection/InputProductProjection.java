package uz.pdp.springbootapp.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springbootapp.Entity.Input;
import uz.pdp.springbootapp.Entity.InputProduct;
import uz.pdp.springbootapp.Entity.Product;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface InputProductProjection {

    Integer getId();

    Double getAmount();

    Double getPrice();

    Date getExpiryDate();

    Input getInput();

    Product getProduct();
}

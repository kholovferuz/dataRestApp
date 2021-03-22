package uz.pdp.springbootapp.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springbootapp.Entity.Attachment;
import uz.pdp.springbootapp.Entity.Category;
import uz.pdp.springbootapp.Entity.Measurement;
import uz.pdp.springbootapp.Entity.Product;

@Projection(types = Product.class)
public interface ProductProjection {
    Integer getId();

    String getName();

    long getActive();

    Category getCategory();

    Measurement getMeasurement();

    Attachment getAttachment();

    String getCode();
}

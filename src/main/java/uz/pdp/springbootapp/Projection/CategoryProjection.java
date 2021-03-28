package uz.pdp.springbootapp.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springbootapp.Entity.Category;

@Projection(types = Category.class)
public interface CategoryProjection {
    Integer getId();

    String getName();

    Boolean getActive();

    String getParentCategory();
}

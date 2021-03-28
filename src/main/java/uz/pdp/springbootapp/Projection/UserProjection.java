package uz.pdp.springbootapp.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springbootapp.Entity.User;
import uz.pdp.springbootapp.Entity.Warehouse;

import java.util.List;

@Projection(types = User.class)
public interface UserProjection {
    Integer getId();

    String getFirstName();

    String getLastName();

    String getPhoneNumber();

    String getCode();

    String getPassword();

    Boolean getActive();

    List<Warehouse> getWarehouses();
}

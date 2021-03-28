package uz.pdp.springbootapp.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springbootapp.Entity.Client;

@Projection(types = Client.class)
public interface ClientProjection {
    Integer getId();

    String getName();

    Boolean getActive();

    String getPhoneNumber();
}

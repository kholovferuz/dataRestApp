package uz.pdp.springbootapp.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springbootapp.Entity.Measurement;

@Projection(types = Measurement.class)
public interface MeasurementProjection {
    Integer getId();

    String getName();

    Boolean getActive();

}

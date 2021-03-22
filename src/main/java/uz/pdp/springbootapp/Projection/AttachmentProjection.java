package uz.pdp.springbootapp.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springbootapp.Entity.Attachment;

@Projection(types = Attachment.class)
public interface AttachmentProjection {
    Integer getId();

    String getName();

    long getSize();

    String getContentType();
}

package uz.pdp.springbootapp.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springbootapp.Entity.Attachment;
import uz.pdp.springbootapp.Entity.AttachmentContent;

@Projection(types = AttachmentContent.class)
public interface AttachmentContentProjection {
    Integer getId();

    byte[] getBytes();

    Attachment getAttachment();
}

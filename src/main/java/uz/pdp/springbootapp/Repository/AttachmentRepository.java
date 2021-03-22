package uz.pdp.springbootapp.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.springbootapp.Entity.Attachment;
import uz.pdp.springbootapp.Entity.Client;
import uz.pdp.springbootapp.Projection.AttachmentProjection;

@RepositoryRestResource(path = "attachment", excerptProjection = AttachmentProjection.class)
public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {
    @RestResource(path = "byContentType")
    Page<Attachment> findAllByContentType(@Param("contentType") String contentType, Pageable pageable);
}

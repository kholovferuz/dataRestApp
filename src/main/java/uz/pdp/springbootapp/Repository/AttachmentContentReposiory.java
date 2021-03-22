package uz.pdp.springbootapp.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.springbootapp.Entity.AttachmentContent;
import uz.pdp.springbootapp.Entity.Client;
import uz.pdp.springbootapp.Projection.AttachmentContentProjection;

import java.util.Optional;

@RepositoryRestResource(path = "attachmentContent", excerptProjection = AttachmentContentProjection.class)
public interface AttachmentContentReposiory extends JpaRepository<AttachmentContent, Integer> {
    @RestResource(path = "byBytes")
    Page<AttachmentContent> findAllByBytes(@Param("bytes") byte[] bytes, Pageable pageable);

}

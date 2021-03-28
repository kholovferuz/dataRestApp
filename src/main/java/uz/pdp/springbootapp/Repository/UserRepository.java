package uz.pdp.springbootapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springbootapp.Entity.User;
import uz.pdp.springbootapp.Projection.UserProjection;

@RepositoryRestResource(path = "user",excerptProjection = UserProjection.class)
public interface UserRepository extends JpaRepository<User, Integer> {


}

package sinclairliang.com.projectmanagementtool.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sinclairliang.com.projectmanagementtool.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

    @Override
    Iterable<Project> findAll();

    Project findByprojectIdentifier(String projectId);
}

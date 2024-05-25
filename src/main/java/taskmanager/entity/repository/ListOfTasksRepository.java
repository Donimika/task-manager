package taskmanager.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taskmanager.entity.ListOfTasksEntity;

public interface ListOfTasksRepository extends JpaRepository<ListOfTasksEntity, Long> {
}

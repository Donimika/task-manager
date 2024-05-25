package taskmanager.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taskmanager.entity.TaskEntity;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}

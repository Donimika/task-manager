package taskmanager.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taskmanager.entity.ListOfTasksEntity;
import taskmanager.entity.SubtaskEntity;

public interface SubtaskRepository extends JpaRepository<SubtaskEntity, Long> {
}

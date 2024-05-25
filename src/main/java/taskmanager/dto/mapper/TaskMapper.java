package taskmanager.dto.mapper;

import org.mapstruct.Mapper;
import taskmanager.dto.TaskDTO;
import taskmanager.entity.TaskEntity;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    TaskDTO toDTO(TaskEntity source);
    TaskEntity toEntity(TaskDTO source);
}

package taskmanager.dto.mapper;

import org.mapstruct.Mapper;
import taskmanager.dto.ListOfTasksDTO;
import taskmanager.entity.ListOfTasksEntity;

@Mapper(componentModel = "spring")
public interface ListOfTasksMapper {
    ListOfTasksDTO toDTO(ListOfTasksEntity source);
    ListOfTasksEntity toEntity(ListOfTasksDTO source);
}

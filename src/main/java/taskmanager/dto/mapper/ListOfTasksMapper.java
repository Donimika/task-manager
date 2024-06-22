package taskmanager.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import taskmanager.dto.ListOfTasksDTO;
import taskmanager.entity.ListOfTasksEntity;

@Mapper(componentModel = "spring", uses = {TaskMapper.class, SubtaskMapper.class})
public interface ListOfTasksMapper {
// šlo by ještě využít druhou metodu TaskIgnoreSubtasksAndParentList , uvidíme co bude lepší až to vyzkoušíme
    @Named("ListOfTasksIgnoreTasks")
    @Mappings({
            @Mapping(target = "tasks", ignore = true)
    })
    ListOfTasksDTO toDTO(ListOfTasksEntity source);
    @Mappings({
            @Mapping(target = "tasks", qualifiedByName = "TaskIgnoreSubtasksAndParentListToEntity")
    })
    ListOfTasksEntity toEntity(ListOfTasksDTO source);
}

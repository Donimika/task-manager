package taskmanager.dto.mapper;

import jdk.jfr.Name;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import taskmanager.dto.TaskDTO;
import taskmanager.entity.TaskEntity;

@Mapper(componentModel = "spring", uses = {ListOfTasksMapper.class, SubtaskMapper.class})
public interface TaskMapper {
    @Named("TaskIgnoreParentListAndSubtasksUsingQualifiedByName")
    @Mappings({
            @Mapping(target = "parentList", qualifiedByName = "ListOfTasksIgnoreTasks"),
            @Mapping(target = "subtasks", qualifiedByName = "SubtaskIgnoreTaskToDTO")
    })
    TaskDTO toDTOIgnoreSubtasksAndParentListUsingQualifiedByName(TaskEntity source);

    @Named("TaskIgnoreSubtasksAndParentListToDTO")
    @Mappings({
            @Mapping(target = "parentList.tasks", ignore = true),
            @Mapping(target = "subtasks", ignore = true)
    })
    TaskDTO toDTOIgnoreSubtasksAndParentList(TaskEntity source);

    @Named("TaskIgnoreSubtasksAndParentListToEntity")
    @Mappings({
            @Mapping(target = "parentList.tasks", ignore = true),
            @Mapping(target = "subtasks", qualifiedByName = "SubtaskIgnoreTaskToEntity")
    })
    TaskEntity toEntity(TaskDTO source);
}

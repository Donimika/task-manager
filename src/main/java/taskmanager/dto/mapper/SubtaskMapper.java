package taskmanager.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import taskmanager.dto.SubtaskDTO;
import taskmanager.entity.SubtaskEntity;

@Mapper(componentModel = "spring", uses = {TaskMapper.class, ListOfTasksMapper.class})
public interface SubtaskMapper {
    @Mappings({
            @Mapping(target = "parentTask.subtasks", ignore = true)
    })
    SubtaskEntity toEntity(SubtaskDTO source);

    @Named("SubtaskIgnoreTaskToEntity")
    @Mappings({
            @Mapping(target = "parentTask", ignore = true)
    })
    SubtaskEntity toEntityIgnoreTasks(SubtaskDTO source);

    @Mappings({
            @Mapping(target = "parentTask.subtasks",ignore = true)
    })
    SubtaskDTO toDTO(SubtaskEntity source);

    @Named("SubtaskIgnoreTaskToDTO")
    @Mappings({
            @Mapping(target = "parentTask", ignore = true)
    })
    SubtaskDTO toDTOIgnoreTasks(SubtaskEntity source);
}

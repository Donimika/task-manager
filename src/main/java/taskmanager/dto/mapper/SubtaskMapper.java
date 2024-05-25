package taskmanager.dto.mapper;

import org.mapstruct.Mapper;
import taskmanager.dto.SubtaskDTO;
import taskmanager.entity.SubtaskEntity;

@Mapper(componentModel = "spring")
public interface SubtaskMapper {
    SubtaskEntity toEntity(SubtaskDTO source);
    SubtaskDTO toDTO(SubtaskEntity source);
}

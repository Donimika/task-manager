package taskmanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class TaskDTO {
    @JsonProperty("id")
    private Long id;
    private String description;
    private ListOfTasksDTO parentList;
    private List<SubtaskDTO> subtasks;
}

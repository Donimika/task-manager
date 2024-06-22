package taskmanager.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ListOfTasksDTO {
    @JsonProperty("id")
    private Long id;
    private String description;
    private List<TaskDTO> tasks;
}

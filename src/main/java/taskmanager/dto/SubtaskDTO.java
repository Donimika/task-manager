package taskmanager.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubtaskDTO {
        @JsonProperty("id")
        private Long id;
        private String description;
        private TaskDTO parentTask;

}


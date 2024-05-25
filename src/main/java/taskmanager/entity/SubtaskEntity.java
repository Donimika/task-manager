package taskmanager.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import taskmanager.dto.TaskDTO;

@Getter
@Setter
@Entity(name = "subtask")
public class SubtaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    
    @ManyToOne
    private TaskEntity parentTask;
}

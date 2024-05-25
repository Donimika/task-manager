package taskmanager.service;

import taskmanager.dto.TaskDTO;

public interface TaskService {
    TaskDTO createTask(TaskDTO taskDTO);
}

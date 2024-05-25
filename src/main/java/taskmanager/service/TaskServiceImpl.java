package taskmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;
import taskmanager.dto.TaskDTO;
import taskmanager.dto.mapper.ListOfTasksMapper;
import taskmanager.dto.mapper.TaskMapper;
import taskmanager.entity.ListOfTasksEntity;
import taskmanager.entity.TaskEntity;
import taskmanager.entity.repository.ListOfTasksRepository;
import taskmanager.entity.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    TaskRepository taskRepository;
    @Autowired
    ListOfTasksRepository listOfTasksRepository;
    @Autowired
    TaskMapper taskMapper;
    @Autowired
    ListOfTasksMapper listOfTasksMapper;
//TODO: JSON nevrací descr Listu ani tasky v něm
    @Override
    public TaskDTO createTask(TaskDTO taskDTO) {
        TaskEntity taskEntity = taskMapper.toEntity(taskDTO);
        TaskEntity savedTaskEntity = taskRepository.save(taskEntity);

        return taskMapper.toDTO(savedTaskEntity);
    }

    private TaskEntity fetchTaskById(long id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Task with id " + id + " wasn't found."));
    }

    private ListOfTasksEntity fetchListById(long id) {
        return listOfTasksRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("TaskList with id " + id + " wasn't found."));
    }
}

package taskmanager.service;

import taskmanager.dto.ListOfTasksDTO;

import java.util.List;

public interface ListOfTasksService {
    ListOfTasksDTO createListOfTasks(ListOfTasksDTO listOfTasksDTO);

    List<ListOfTasksDTO> getAllListsOfTasks();
}

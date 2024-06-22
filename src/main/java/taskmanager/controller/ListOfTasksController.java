package taskmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import taskmanager.dto.ListOfTasksDTO;
import taskmanager.entity.ListOfTasksEntity;
import taskmanager.service.ListOfTasksService;

import java.util.List;

@RestController
@RequestMapping("/list")
public class ListOfTasksController {
    @Autowired
    ListOfTasksService listOfTasksService;

    @PostMapping("")
    public ListOfTasksDTO createListOfTasks(@RequestBody ListOfTasksDTO listOfTasksDTO) {
        return listOfTasksService.createListOfTasks(listOfTasksDTO);
    }

    @GetMapping("")
    public List<ListOfTasksDTO> getAllListsOfTasks() {
        return listOfTasksService.getAllListsOfTasks();
    }
}

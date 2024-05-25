package taskmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import taskmanager.dto.ListOfTasksDTO;
import taskmanager.entity.ListOfTasksEntity;
import taskmanager.service.ListOfTasksService;

@RestController
@RequestMapping("/list")
public class ListOfTasksController {
    @Autowired
    ListOfTasksService listOfTasksService;

    @PostMapping("")
    public ListOfTasksDTO createListOfTasks(@RequestBody ListOfTasksDTO listOfTasksDTO) {
        return listOfTasksService.createListOfTasks(listOfTasksDTO);
    }
}

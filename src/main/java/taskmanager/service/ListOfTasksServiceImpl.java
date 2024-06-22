package taskmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taskmanager.dto.ListOfTasksDTO;
import taskmanager.dto.mapper.ListOfTasksMapper;
import taskmanager.entity.ListOfTasksEntity;
import taskmanager.entity.repository.ListOfTasksRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ListOfTasksServiceImpl implements ListOfTasksService {

    @Autowired
    ListOfTasksMapper listOfTasksMapper;
    @Autowired
    ListOfTasksRepository listOfTasksRepository;

    @Override
    public ListOfTasksDTO createListOfTasks(ListOfTasksDTO listOfTasksDTO) {
        ListOfTasksEntity listOfTasksEntity = listOfTasksMapper.toEntity(listOfTasksDTO);
        ListOfTasksEntity savedListOfTaskEntity = listOfTasksRepository.save(listOfTasksEntity);
        return listOfTasksMapper.toDTO(savedListOfTaskEntity);
    }
    //:TODO ignore v jedntlivých mapperech, může způsobit chybu u get metod v podobě null hodnoty, možná bude třeba ji ručně přiřadit zde
    @Override
    public List<ListOfTasksDTO> getAllListsOfTasks() {
        return listOfTasksRepository.findAll().stream()
                .map(listOfTasksMapper::toDTO)
                .collect(Collectors.toList());
    }
}

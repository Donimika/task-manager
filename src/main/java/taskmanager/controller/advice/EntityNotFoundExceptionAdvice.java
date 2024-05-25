package taskmanager.controller.advice;

import jakarta.persistence.EntityNotFoundException;
import org.webjars.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class EntityNotFoundExceptionAdvice {
    @ExceptionHandler({NotFoundException.class, EntityNotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handleEntityNotFound() {
    }
}

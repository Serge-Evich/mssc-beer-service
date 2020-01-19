package microserivces.msscbeerservice.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<List<String>> handle(ConstraintViolationException ex) {
        return ResponseEntity.badRequest().body(ex.getConstraintViolations().stream()
                .map(ConstraintViolation::toString)
                .collect(Collectors.toList()));
    }
}

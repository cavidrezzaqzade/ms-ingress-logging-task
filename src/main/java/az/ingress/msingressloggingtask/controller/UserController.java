package az.ingress.msingressloggingtask.controller;

import az.ingress.msingressloggingtask.logging.annotation.LogExecutionTime;
import az.ingress.msingressloggingtask.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@Tag(name = "User", description = "the User api")
public class UserController {

    private final UserService service;

    @Operation(summary = "get all users", description = "get all users", tags = {"User"})
    @GetMapping
    public ResponseEntity<?> getAll(){
        return  new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @Operation(summary = "get user by id", description = "get user by id", tags = {"User"})
    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@NotNull @PathVariable("id") Long id){
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }

}

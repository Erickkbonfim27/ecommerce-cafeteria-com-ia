package br.com.cafeteria.inteligente.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/todos")
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok().body(userService.getAllUsers());
    }

    @PostMapping("/auth/Login")
    public ResponseEntity<AuthResponseDto> LoginUser(@RequestBody LoginUserDto loginDto){
        return ResponseEntity.ok().body(userService.authenticateLogin(loginDto));
    }

    @PostMapping("/auth/createUser")
    public ResponseEntity<AuthResponseDto> CreateUser(@RequestBody CreateUserDto createDto){
        return ResponseEntity.ok().body(userService.createAndAuthenticateUser(createDto));
    }
}

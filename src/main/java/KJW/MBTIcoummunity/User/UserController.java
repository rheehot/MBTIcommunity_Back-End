package KJW.MBTIcoummunity.User;

import KJW.MBTIcoummunity.User.Dto.UserCreateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final Logger logger = Logger.getLogger(UserController.class.getName());

    private final UserService userService;

    @PostMapping("/signup")
    public User postUser(@RequestBody UserCreateDto user) {
        return userService.createUser(user);
    }

    @GetMapping("/user")
        public ResponseEntity<?> getUser(@AuthenticationPrincipal UserDetails user) {
        return new ResponseEntity<>(user,HttpStatus.OK);
    }
}

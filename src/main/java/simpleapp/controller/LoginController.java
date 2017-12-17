package simpleapp.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity singinUser(@RequestBody User user) {

        if (user.getEmail().equals("leoroque@live.com") && user.getPassword().equals("senha")) {
            return ResponseEntity.status(HttpStatus.OK).build();
        }else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }

    }

}

package simpleapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameSessionController {

    @RequestMapping(value = "/start", method = RequestMethod.POST)
    public ResponseEntity startGame(@RequestBody User user) {

        System.out.println("Starting game for user  " + user.getEmail());

        return ResponseEntity.status(HttpStatus.OK).build();
    }




    @RequestMapping(value = "/end", method = RequestMethod.POST)
    public ResponseEntity endGame( ) {

      //  System.out.println("Finishing game for user  " + user.getEmail());

        return ResponseEntity.status(HttpStatus.OK).build();
    }

}

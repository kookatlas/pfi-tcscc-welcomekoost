package in.koost.pfi_tcscc_welcomekoost.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KoostWelcomeController {

    @GetMapping("/koost")
    public ResponseEntity<String> greet(){
        return new ResponseEntity<>("Welcome to Koost", HttpStatus.OK);
    }
}

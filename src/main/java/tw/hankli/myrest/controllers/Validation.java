package tw.hankli.myrest.controllers;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/validation")
public class Validation {

    @PostMapping
    @ApiOperation(value = "驗證使用者")
    public ResponseEntity validate(@RequestParam String username, @RequestParam String password) {

        if (username.equals("abc") && password.equals("1234")) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

}

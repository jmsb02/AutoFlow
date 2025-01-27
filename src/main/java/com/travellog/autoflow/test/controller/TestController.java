package com.travellog.autoflow.test.controller;

import com.travellog.autoflow.test.controller.docs.TestControllerDocs;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController implements TestControllerDocs {

    @GetMapping("/")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("헬스 체크");
    }

}

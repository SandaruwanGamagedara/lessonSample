package lk.w3academy.test.controller;

import lk.w3academy.test.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }
    @GetMapping("/test")
    public String findAll(){
        testService.findAll();
        return testService.test();
    }
}

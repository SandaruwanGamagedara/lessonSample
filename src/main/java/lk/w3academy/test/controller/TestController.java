package lk.w3academy.test.controller;


import lk.w3academy.test.entity.Test;
import lk.w3academy.test.service.TestServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    private final TestServiceImpl testService;


    public TestController(TestServiceImpl testService) {
        this.testService = testService;
    }

    @GetMapping("/test")
    public List<Test> findAll() {
        return testService.findAll();
    }

    @GetMapping("/test/{id}")
    public Test findById(@PathVariable Integer id) {
        System.out.println("came here");
        return testService.findById(id);
    }
}

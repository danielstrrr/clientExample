package app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentsController {

    @GetMapping("/students")
    public String someStudents()
    {
        return "Dana, David, Dudu";
    }
}
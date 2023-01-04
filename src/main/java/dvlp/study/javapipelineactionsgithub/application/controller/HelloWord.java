package dvlp.study.javapipelineactionsgithub.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWord")
public class HelloWord {

    @GetMapping
    public String helloWord(){
        return "Hello Word";
    }
}

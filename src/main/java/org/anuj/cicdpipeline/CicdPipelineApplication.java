package org.anuj.cicdpipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdPipelineApplication {
    @GetMapping("/welcome")
    public  String welcome(){
        return "welcome to java techie";
    }

    public static void main(String[] args) {
        SpringApplication.run(CicdPipelineApplication.class, args);
    }

}

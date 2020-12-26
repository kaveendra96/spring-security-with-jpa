package lk.kaveendra.springsecurityjpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home controller";
    }

    @GetMapping("/user")
    public String user() {
        return "user controller";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin controller";
    }


}

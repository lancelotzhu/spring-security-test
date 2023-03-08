package top.lancelotzhu.server.biz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/profile")
    public String profile() {
        return "Hello";
    }
}

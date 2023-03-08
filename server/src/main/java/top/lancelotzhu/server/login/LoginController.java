package top.lancelotzhu.server.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/login")
    public void login() {
    }

    @GetMapping("/logout")
    public void logout() {
    }
}

package top.lancelotzhu.server.biz;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/profile")
    public DefaultOAuth2User profile() {
        return (DefaultOAuth2User) SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}

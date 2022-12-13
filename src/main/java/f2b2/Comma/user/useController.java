package f2b2.Comma.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class useController {

    private final UserService userService;
    @GetMapping("/api/hello/{userId}")
    public String test(@PathVariable Long userId){

        User user = userService.find(userId);
        return user.getName();
    }
}

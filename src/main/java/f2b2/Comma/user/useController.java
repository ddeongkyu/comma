package f2b2.Comma.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class useController {

    private final UserService userService;
    @GetMapping("/api/hello/{userId}")
    public String test(@PathVariable Long userId){
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();

        user1.setName("1번");
        user2.setName("2번");
        user3.setName("3번");
        user4.setName("4번");

        userService.save(user1);
        userService.save(user2);
        userService.save(user3);
        userService.save(user4);

        User user = userService.find(userId);
        return user.getName();
    }
}

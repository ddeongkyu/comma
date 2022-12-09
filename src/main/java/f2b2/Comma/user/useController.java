package f2b2.Comma.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class useController {
    @GetMapping("/api/hello")
    public String test(){
        return "안녕";
    }
}

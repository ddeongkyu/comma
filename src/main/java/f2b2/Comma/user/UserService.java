package f2b2.Comma.user;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class UserService {

    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    public User save(User user){
        User save = userRepository.save(user);
        return userRepository.findById(save.getId()).get();
    }

    public User find(Long id){
        User user = userRepository.findById(id).orElseThrow(()->{
            return new RuntimeException("아");
        });

        return user;
    }

}

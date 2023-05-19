package az.ingress.msingressloggingtask.service;

import az.ingress.msingressloggingtask.logging.annotation.LogExecutionTime;
import az.ingress.msingressloggingtask.model.UserDto;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author caci
 */

@Service
public class UserServiceImpl implements UserService {

    @LogExecutionTime
    @Override
    public List<UserDto> getAll() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return List.of(
                UserDto.builder().id(1L).name("Cavid").build(),
                UserDto.builder().id(2L).name("Xanlar").build()
        );
    }

    @LogExecutionTime
    @Override
    public UserDto getById(Long id) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return UserDto.builder().id(1L).name("Cavid").build();
    }
}

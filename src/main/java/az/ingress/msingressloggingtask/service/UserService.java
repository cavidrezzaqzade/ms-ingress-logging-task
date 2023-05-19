package az.ingress.msingressloggingtask.service;

import az.ingress.msingressloggingtask.model.UserDto;
import java.util.List;

/**
 * @author caci
 */

public interface UserService {

    List<UserDto> getAll();

    UserDto getById(Long id);

}

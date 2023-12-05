package umc.spring.service.UserService;

import umc.spring.domain.User;
import umc.spring.web.dto.UserJoinRequestDTO;

public interface UserCommandService {
    User joinMember(UserJoinRequestDTO request);
}

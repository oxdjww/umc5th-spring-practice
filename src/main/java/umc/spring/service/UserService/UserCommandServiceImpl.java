package umc.spring.service.UserService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.spring.converter.UserConverter;
import umc.spring.domain.User;
import umc.spring.repository.UserRepository;
import umc.spring.web.dto.UserJoinRequestDTO;

@Service
@AllArgsConstructor
public class UserCommandServiceImpl implements UserCommandService {
    private final UserRepository userRepository;

    @Override
    @Transactional
    public User joinMember(UserJoinRequestDTO request) {
        User newUser = UserConverter.toUserEntity(request);
        return userRepository.save(newUser);
    }
}

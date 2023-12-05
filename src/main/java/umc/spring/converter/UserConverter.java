package umc.spring.converter;

import umc.spring.domain.User;
import umc.spring.web.dto.UserJoinRequestDTO;
import umc.spring.web.dto.UserJoinResponseDTO;

public class UserConverter {
    public static User toUserEntity(UserJoinRequestDTO request) {
        return User.builder()
                .name(request.name())
                .address(request.address())
                .specAddress(request.specAddress())
                .password(request.password())
                .email(request.email())
                .point(request.point())
                .phoneNumber(request.phoneNumber())
                .gender(request.gender())
                .build();
    }

    public static UserJoinResponseDTO toUserJoinResponseDTO(User user) {
        return UserJoinResponseDTO.builder()
                .userId(user.getId())
                .createdAt(user.getCreatedAt())
                .build();
    }
}

package umc.spring.web.dto;

import lombok.Builder;
import umc.spring.enums.Gender;

@Builder
public record UserJoinRequestDTO(
        String name,
        String address,
        String specAddress,
        String password,
        String email,
        Integer point,
        String phoneNumber,
        Gender gender
) {
}
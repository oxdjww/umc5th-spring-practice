package umc.spring.web.dto;

import java.time.LocalDateTime;
import lombok.Builder;

@Builder
public record UserJoinResponseDTO (
        Long userId,
        LocalDateTime createdAt
){
}
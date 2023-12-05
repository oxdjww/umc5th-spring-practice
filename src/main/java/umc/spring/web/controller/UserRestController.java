package umc.spring.web.controller;

import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.spring.apiPayload.ApiResponse;
import umc.spring.converter.UserConverter;
import umc.spring.domain.User;
import umc.spring.service.UserService.UserCommandService;
import umc.spring.web.dto.UserJoinRequestDTO;
import umc.spring.web.dto.UserJoinResponseDTO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class UserRestController {

    private final UserCommandService userCommandService;

    @PostMapping("/")
    public ApiResponse<UserJoinResponseDTO> join(@RequestBody @Valid UserJoinRequestDTO request){
        User newUser = userCommandService.joinMember(request);
        return ApiResponse.onSuccess(UserConverter.toUserJoinResponseDTO(newUser));
    }
}

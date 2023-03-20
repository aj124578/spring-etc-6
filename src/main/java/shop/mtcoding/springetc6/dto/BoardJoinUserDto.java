package shop.mtcoding.springetc6.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardJoinUserDto {
    private BoardDto board;
    private UserDto user;
    // private List<BoardDto> boards;
}

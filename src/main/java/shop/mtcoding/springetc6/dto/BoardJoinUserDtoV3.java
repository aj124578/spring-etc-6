package shop.mtcoding.springetc6.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BoardJoinUserDtoV3 { // 엔티티를 노출할 수 없으니 dto로 바꾸고 orm 방식으로 받은거
    private Integer id;
    private String title;
    private String content;
    private UserDto user;
    private Timestamp createdAt;

    @Getter @Setter
    public static class UserDto{ // 최종적으로 리턴하고 싶은 데이터를 dto로 만들기
        private Integer id;
        private String username;
        private String password;
        private String email;
        private Timestamp createdAt;
    }
}

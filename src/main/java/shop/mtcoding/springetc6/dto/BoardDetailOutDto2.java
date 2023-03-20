package shop.mtcoding.springetc6.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BoardDetailOutDto2 { // board 게시글 상세보기를 위한 최종 하면
    private Integer id;
    private String title;
    private String content;
    private UserDto user;
    private Timestamp createdAt;


    public BoardDetailOutDto2(BoardDetailOutDto board) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.user = user;
        this.createdAt = createdAt;
    }


    @Getter @Setter
    public class UserDto{ // 내부클래스로 UserDto를 만들어서 따로 사용
        private Integer id;
        private String username;
        private String password;
        private String email;
        private Timestamp createdAt;


        public UserDto(Integer id, String username, String password, String email, Timestamp createdAt) {
            this.id = id;
            this.username = username;
            this.password = password;
            this.email = email;
            this.createdAt = createdAt;
        }
        
    }

}

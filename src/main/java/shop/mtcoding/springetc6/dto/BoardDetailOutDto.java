package shop.mtcoding.springetc6.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString // dto는 tostring 막 붙여도 됨 쓰고나서 주석처리 해도 됨
@Getter @Setter
public class BoardDetailOutDto {
    private Integer id;
    private String title;
    private String content;
    private Timestamp createdAt;
    private Integer userId;
    private String userUsername;
    private String userPassword;
    private String userEmail;
    private Timestamp userCreatedAt;

}

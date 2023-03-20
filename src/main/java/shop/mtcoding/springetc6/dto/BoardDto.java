package shop.mtcoding.springetc6.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BoardDto {
    private Integer id;
    private String title;
    private String content;
    // private UserDto user;
    private Timestamp createdAt;
}

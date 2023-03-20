package shop.mtcoding.springetc6.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ResponseDto<T> {
    private String msg;
    private T data;
}

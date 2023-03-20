package shop.mtcoding.springetc6.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.springetc6.dto.BoardDetailOutDto2;
import shop.mtcoding.springetc6.dto.BoardJoinUserDto;
import shop.mtcoding.springetc6.dto.BoardJoinUserDto2;
import shop.mtcoding.springetc6.service.BoardService;

@RequiredArgsConstructor
@RestController
public class BoardController {
    
    private final BoardService boardService;

    @GetMapping("/board/{id}")
    public ResponseEntity<?> detail(@PathVariable Integer id){
        BoardDetailOutDto2 dto = boardService.게시글상세보기(id); // 서비스는 외부랑 통신하는 메서드가 아니여서 보기편하게 한글로 하는게 좋음
        return ResponseEntity.ok().body(dto);
    }

    @GetMapping("/board/v2/{id}")
    public ResponseEntity<?> detailV2(@PathVariable Integer id) {
        BoardJoinUserDto dto = boardService.게시글상세보기2(id); // 서비스는 외부랑 통신하는 메서드가 아니여서 보기편하게 한글로 하는게 좋음
        return ResponseEntity.ok().body(dto);
    }

    @GetMapping("/board/v3/{id}")
    public ResponseEntity<?> detailV3(@PathVariable Integer id) {
        BoardJoinUserDto2 dto = boardService.게시글상세보기3(id); // 서비스는 외부랑 통신하는 메서드가 아니여서 보기편하게 한글로 하는게 좋음
        return ResponseEntity.ok().body(dto);
    }
}

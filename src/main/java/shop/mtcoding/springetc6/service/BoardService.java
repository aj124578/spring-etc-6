package shop.mtcoding.springetc6.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.springetc6.dto.BoardDetailOutDto;
import shop.mtcoding.springetc6.model.board.BoardRepository;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public void 게시글상세보기(Integer id) {
        BoardDetailOutDto boardDetailOutDto = boardRepository.findByIdJoinUser(id);
        System.out.println("디버그 : " + boardDetailOutDto);


    }
    
}

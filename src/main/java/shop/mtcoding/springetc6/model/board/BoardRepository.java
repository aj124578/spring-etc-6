package shop.mtcoding.springetc6.model.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.mtcoding.springetc6.dto.BoardDetailOutDto;

@Mapper
public interface BoardRepository {
    public int insert(Board board);

    public int updateById(Board board);

    public int deleteById(int id);

    public List<Board> findAll();

    public Board findById(int id);

    public BoardDetailOutDto findByIdJoinUser(int id);
}

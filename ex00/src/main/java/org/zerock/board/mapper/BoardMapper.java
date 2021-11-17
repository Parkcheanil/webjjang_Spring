package org.zerock.board.mapper;

import java.util.List;

import org.zerock.board.vo.BoardVO;

import com.webjjang.util.PageObject;

public interface BoardMapper {

	// 게시판 리스트
	public List<BoardVO> list(PageObject pageObject);
	
	// 게시판 글보기
	public BoardVO view(Long no);
	
	// 조회수 1증가
	public int increase(Long no);
	
	// 게시판 글쓰기
	public int write(BoardVO vo);
	
	// 게시판 글수정
	public int update(BoardVO vo);
	
	// 게시판 글수정
	public int delete(Long no);
	
	// 게시판 전체 글수
	public long getTotalRow(PageObject pageObject);
}

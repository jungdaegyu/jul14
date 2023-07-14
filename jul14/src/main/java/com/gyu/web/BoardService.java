package com.gyu.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

	@Autowired
	private BoardDAO boardDAO;
	
	
	public List<BoardDTO> boardList() { //DAO가 일하게 던져주는거인듯

		return boardDAO.boardList();
	}
	
	

}

package com.gyu.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

	@Autowired
	private BoardService service;
	
	
	//1.board리스트 보는 화면 = board.jsp
	@GetMapping("/board")
	public String board(Model model) {
		//데이터 붙이기하고자 합니다.
		model.addAttribute("name", "1234");
		
		//service에서 메소드 불러오겠습니다.
		List<BoardDTO> list = service.boardList();//값 만들고 하는건 서비스에게 던지고 정리나 출력정도만 하는듯
		//서비스한테 일을 시켜서 리스트를 가져온거임 바로 위에서
		if (!list.isEmpty()) {
			model.addAttribute("list", list);
			return "board";
			
		} else {
			return "redirect:/"; // 이건 인덱스 컨트롤러에서 getmapping에 /로 해놨으니까 홈으로 다시 가라는 뜻
		}
		
		

	}
	
	//2.detail 상세보기 화면 = detail.jsp
	@GetMapping("/detail")
	public String detail(HttpServletRequest request) {
		String bno = request.getParameter("bno");
		// System.out.println(bno);
		
		try {
			int no = Integer.parseInt(bno); 
			System.out.println("숫자입니다");
		} catch (Exception e) {
			System.out.println("숫자가 아닙니다.");
		}
		
		
		

		

		if (true) {
			
		} else {
				
		}
				
		return "detail";
	}
	
	
	
	
	
}

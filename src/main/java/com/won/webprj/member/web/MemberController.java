package com.won.webprj.member.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.won.webprj.member.service.MemberService;
import com.won.webprj.member.service.MemberVO;

@Controller
public class MemberController {
	@Autowired
	MemberService memberDao; // DAO 자동주입
	
	@RequestMapping("/loginForm.do")
	public String loginForm() {
		return "member/loginForm";
	}
	
	@PostMapping("/memberLogin.do")
	public String memberLogin(MemberVO vo, Model model, HttpSession session) {
		vo = memberDao.memberSelect(vo); // 회원 정보를 넘겨서 일치하는 회원의 정보를 불러옴
		if (vo != null) {
			session.setAttribute("id", vo.getId());
			session.setAttribute("name", vo.getName());
			session.setAttribute("author", vo.getAuthor());
			model.addAttribute("message", "님 환영합니다.");
		} else {
			model.addAttribute("message", "아이디 또는 패스워드가 틀립니다.");
		}
		
		return "member/memberLoginResult";
	}
	
	@RequestMapping("/memberLogout.do")
	public String memberLogout(HttpSession session, Model model) {
		String name = (String)session.getAttribute("name"); // 세션에 보관된 이름 가져오기
		model.addAttribute("message", name + "님 정상적으로 로그아웃 되었습니다.");
		session.invalidate();
		return "member/memberLoginResult";
	}
	
}

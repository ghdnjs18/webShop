package com.won.webprj.member.service;

import java.util.List;

public interface MemberService {
	List<MemberVO> memberSelectList(); // 전체 리스트 조회
	MemberVO memberSelect(MemberVO vo); // 한명 정보 조회 (로그인때 체크)
	int memberInsert(MemberVO vo); // 회원 추가
	int memberUpdate(MemberVO vo); // 회원 정보 수정
	int memberDelete(MemberVO vo); // 회원 삭제
	boolean memberIdCheck(String id); // 아이디 중복 체크용
}

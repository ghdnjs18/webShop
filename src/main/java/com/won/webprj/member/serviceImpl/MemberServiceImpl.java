package com.won.webprj.member.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.won.webprj.member.service.MemberMapper;
import com.won.webprj.member.service.MemberService;
import com.won.webprj.member.service.MemberVO;

@Repository("memberDao")
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberMapper map;
	
	@Override
	public List<MemberVO> memberSelectList() {
		return map.memberSelectList();
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		return map.memberSelect(vo);
	}

	@Override
	public int memberInsert(MemberVO vo) {
		return map.memberInsert(vo);
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		return map.memberUpdate(vo);
	}

	@Override
	public int memberDelete(MemberVO vo) {
		return map.memberDelete(vo);
	}

	@Override
	public boolean memberIdCheck(String id) {
		return map.memberIdCheck(id);
	}

}

package com.ssu.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssu.domain.MemberVO;

@Repository
public class MemberDAOImpl extends GenericDAOImpl<MemberVO, String> implements MemberDAO {
	@Override
	public void register(MemberVO vo) {
		// TODO Auto-generated method stub
		super.register(vo);
	}
	
	@Override
	public boolean loginCheck(MemberVO vo) {
		return super.loginCheck(vo);
	}

	@Override
	public MemberVO get(String userid) {
		// TODO Auto-generated method stub
		return super.get(userid);
	}
	
	@Override
	public int delete(String userid) {
		return super.delete(userid);
	}

	@Override
	public List<MemberVO> getList() {
		// TODO Auto-generated method stub
		return super.getList();
	}
}

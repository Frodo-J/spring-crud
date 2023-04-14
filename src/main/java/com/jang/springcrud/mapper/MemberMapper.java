package com.jang.springcrud.mapper;

import com.jang.springcrud.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    public int insertMember(MemberDTO member);

    public List<MemberDTO> selectMemberList();

    public int updateMember(MemberDTO member);

    public int deleteMember(int empId);

}

package com.jang.springcrud;

import com.jang.springcrud.dto.MemberDTO;
import com.jang.springcrud.entitiy.Member;
import com.jang.springcrud.mapper.MemberMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringCrudApplicationTests {

    @Autowired
    private MemberMapper memberMapper;

    @Test
    public void testMemberInsert() {
        MemberDTO member = new MemberDTO();
        member.setEmpId(1);
        member.setEmpNm("1번업무자");

        int result = memberMapper.insertMember(member);

    }

    @Test
    public void testMemberListSelect() {
        List<MemberDTO> member = memberMapper.selectMemberList();

        for (MemberDTO memberDTO : member) {
            System.out.print(memberDTO.getEmpId() + " ");
            System.out.println(memberDTO.getEmpNm());
        }
    }

    @Test
    public void testMemberUpdate() {
        MemberDTO member = new MemberDTO();
        member.setEmpId(1);
        member.setEmpNm("수정자");

        int result = memberMapper.updateMember(member);
    }

    @Test
    public void testMemberDelete() {
        MemberDTO member = new MemberDTO();
        member.setEmpId(1);

        int result = memberMapper.deleteMember(member.getEmpId());

    }

}

package com.testing.testing.service;
import com.testing.testing.entity.BookEntity;
import com.testing.testing.entity.MemberEntity;
import com.testing.testing.repository.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    //add member
    public MemberEntity addmember(MemberEntity memberEntity) {
        return memberRepository.save(memberEntity);
    }

    public List<MemberEntity> findAll() {
        return memberRepository.findAll();
    }

    public void deleteById(Long id) { // Industrial standard ke liye 'Long' type use karein
        // Pehle check karein ki member database mein hai ya nahi
        if (!memberRepository.existsById(id)) {
            throw new jakarta.persistence.EntityNotFoundException("Member nahi mila with id: " + id);
        }
        // Sahi method 'deleteById' hai aur yeh void hota hai
        memberRepository.deleteById(id);
    }
}

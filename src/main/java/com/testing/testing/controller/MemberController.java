package com.testing.testing.controller;

import com.testing.testing.entity.MemberEntity;
import com.testing.testing.repository.MemberRepository;
import com.testing.testing.service.MemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/members")
public class MemberController {

    final MemberService memberService;
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    //getmember
    @GetMapping
    public List<MemberEntity> findAll() {
        return memberService.findAll();
    }

    @PostMapping // 👈 Bracket mein kuch mat likho, ekdum khali!
    public ResponseEntity<MemberEntity> createMember(@RequestBody MemberEntity memberEntity) {
        MemberEntity savedMember = memberService.addmember(memberEntity);
        return ResponseEntity.ok(savedMember);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteMember(@PathVariable Long id) {
        // Step 1: Controller ne id ko MemberService ke paas bhej diya
        memberService.deleteById(id);

        // Step 2: Delete hone ke baad ek saaf message return kiya (Status 200 OK ke sath)
        return ResponseEntity.ok("Member deleted successfully with id: " + id);
    }


}

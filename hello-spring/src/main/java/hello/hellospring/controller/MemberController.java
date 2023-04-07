package hello.hellospring.controller;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//스프링 컨테이너가 객체를 생성해서 관리(빈) => 스프링 컨트롤러에 등록하기 => 생성자 + @Autowired
//스프링 관리에 따라 new로 생성하지 않음 => 하나만 생성해두고 공용으로 쓰면 됨
@Controller
public class MemberController {
    private final MemberService memberService;

    // DI : 생성자 주입 방식
    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }


}

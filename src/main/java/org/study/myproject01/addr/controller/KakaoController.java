package org.study.myproject01.addr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.study.myproject01.addr.vo.AddrVO;

@Controller
@RequestMapping("/daum")
public class KakaoController {
    @GetMapping("/addrForm")
    public String addForm() {return "kakao/addrForm";}

    @PostMapping("/addrresult")
    public String addrResult(AddrVO addrVO, Model model) {
        // 원래는 DB 처리
        model.addAttribute("addrVO", addrVO);
        return "kakao/addrResult";
    }
}

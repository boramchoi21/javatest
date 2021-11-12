package com.sparta.weektest.controller;

import com.sparta.weektest.domain.MemoRepository;
import com.sparta.weektest.domain.MemoRequestDto;
import com.sparta.weektest.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemoController {
    private final MemoRepository memoRepository;
    private final MemoService memoService;

    @PostMapping("/api/memos")
    public Memo createMemo(MemoRequestDto requestDto){
        Memo memo = new Memo(requestDto);
        return memoRepository.save(memo);
    }
    @GetMapping("api/memos")
    public List<Memo> readMemo(){
        return memoRepository();
    }
}

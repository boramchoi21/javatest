package com.sparta.weektest.service;

import com.sparta.weektest.domain.MemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemoService {
    private final MemoRepository memoRepository;
}

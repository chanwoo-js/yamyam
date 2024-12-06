package org.koreait.yumyum.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.koreait.yumyum.common.constant.ApiMappingPattern;
import org.koreait.yumyum.dto.ResponseDto;
import org.koreait.yumyum.dto.stat.response.StatsMenuResponseDto;
import org.koreait.yumyum.service.StatsMenuService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping(ApiMappingPattern.STATS) // /api/v1/stats;
public class StatsMenuController {

    private final StatsMenuService statsMenuService;


    @GetMapping("/menus/day/{date}")
    public ResponseEntity<ResponseDto<List<StatsMenuResponseDto>>> getDailySales(
            @Valid
            @PathVariable String date,// 2024-11-01
            @AuthenticationPrincipal String userId
            ) {
        System.out.println("받은 userId: " + userId);
        ResponseDto<List<StatsMenuResponseDto>> result = statsMenuService.getDailySales(userId, date);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
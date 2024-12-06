package org.koreait.yumyum.dto.stat.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class StatsMenuResponseDto {
    private LocalDate date;
    private String menuName;
    private Long totalQuantity;
    private Long totalSales;
}
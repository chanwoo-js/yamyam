package org.koreait.yumyum.dto.store.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ReviewStatisticsResponseDto {
    private Integer rating;
    private Long reviewCount;
}
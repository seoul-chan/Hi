package com.hi.dto;

import com.hi.domain.Accommodation;
import lombok.Data;

import java.util.List;

@Data
public class AccommodationResDto {
    private Long id;
    private String nameKor;
    private String nameEng;
    private int priceKor;
    private Float rating;
    private String region;
    private List<String> urlList;

    public AccommodationResDto(Accommodation acm, ImageDto dto) {
        this.id = acm.getId();
        this.nameKor = acm.getNameKor();
        this.nameEng = acm.getNameEng();
        this.priceKor = acm.getPriceKor();
        this.rating = acm.getRating();
        this.region = acm.getRegion();
        this.urlList = dto.getUrlList();
    }

}

package com.example.test.model.beans.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

@Component
@Data
public class Criteria {
    private int pageNum;
    private int amount;
    private String keyword;
    private String type;

    public Criteria(){
        this(1, 10);
    }

    public Criteria(int pageNum, int amount) {
        this.pageNum = pageNum;
        this.amount = amount;
    }

    public String getListLink(){
        UriComponentsBuilder builder = UriComponentsBuilder.fromPath("")
                .queryParam("pageNum", pageNum)
                .queryParam("amount", amount)
                .queryParam("type", type)
                .queryParam("keyword", keyword);
        return builder.toUriString();
    }

    public String[] getTypeArr(){
        return type == null ? new String[] {} : type.split("");
    }
}

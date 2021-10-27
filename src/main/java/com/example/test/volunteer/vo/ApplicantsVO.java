package com.example.test.volunteer.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ApplicantsVO {

    private Long applicantsNo;
    private Long volunteerBoardNo;
    private Long docNo;
    private String docName;
    private String docPhoneNum;
    private int applicants;
    private String applicationContent;
    private String applicationDate;

}

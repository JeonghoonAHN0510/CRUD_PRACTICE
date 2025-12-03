package com.jeonghoon.crud_practice.model.dto;

import com.jeonghoon.crud_practice.model.entity.MemberEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {
    private int mno;
    private String mid;
    private String mpwd;
    private String mnickname;
    private String memail;
    private String mrole;
    private String maddress1;
    private String maddress2;


    public MemberEntity toEntity(){
        return MemberEntity.builder()
                .mno(this.mno)
                .mid(this.mid)
                .mnickname(this.mnickname)
                .memail(this.memail)
                .mrole(this.mrole)
                .maddress1(this.maddress1)
                .maddress2(this.maddress2)
                .build();
    } // func end
} // class end
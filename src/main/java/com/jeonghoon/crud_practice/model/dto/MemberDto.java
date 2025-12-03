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



    public MemberEntity toEntity(){
        return MemberEntity.builder()
                .mno(this.mno)
                .build();
    } // func end
} // class end
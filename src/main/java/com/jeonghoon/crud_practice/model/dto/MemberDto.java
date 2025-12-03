package com.jeonghoon.crud_practice.model.dto;

import com.jeonghoon.crud_practice.model.entity.MemberEntity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {
    private int member_pk;
    private String member_id;
    private String member_pwd;
    private String member_nickname;
    private String member_email;
    private String member_role;
    private String member_address1;
    private String member_address2;
    private LocalDateTime create_date;
    private LocalDateTime update_date;


    public MemberEntity toEntity(){
        return MemberEntity.builder()
                .member_pk(this.member_pk)
                .member_id(this.member_id)
                .member_nickname(this.member_nickname)
                .member_email(this.member_email)
                .member_role(this.member_role)
                .member_address1(this.member_address1)
                .member_address2(this.member_address2)
                .build();
    } // func end
} // class end
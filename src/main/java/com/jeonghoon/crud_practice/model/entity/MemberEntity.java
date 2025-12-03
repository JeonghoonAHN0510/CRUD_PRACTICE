package com.jeonghoon.crud_practice.model.entity;

import com.jeonghoon.crud_practice.model.dto.MemberDto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "member")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberEntity extends BaseTime{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int unsigned")
    private int member_pk;
    @Column(columnDefinition = "varchar(30) not null unique")
    private String member_id;
    @Column(columnDefinition = "varchar(100) not null")
    private String member_pwd;
    @Column(columnDefinition = "varchar(50) not null unique")
    private String member_nickname;
    @Column(columnDefinition = "varchar(50) not null unique")
    private String member_email;
    @Column(columnDefinition = "enum('USER', 'OWNER', 'ADMIN') not null")
    private String member_role;
    @Column(columnDefinition = "varchar(100)")
    private String member_address1;
    @Column(columnDefinition = "varchar(100)")
    private String member_address2;

    public MemberDto toDto(){
        return MemberDto.builder()
                .member_pk(this.member_pk)
                .member_id(this.member_id)
                .member_nickname(this.member_nickname)
                .member_email(this.member_email)
                .member_role(this.member_role)
                .member_address1(this.member_address1)
                .member_address2(this.member_address2)
                .create_date(this.getCreate_date())
                .update_date(this.getUpdate_date())
                .build();
    } // func end
} // class end
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
    private int mno;
    @Column(columnDefinition = "varchar(30) not null unique")
    private String mid;
    @Column(columnDefinition = "varchar(100) not null")
    private String mpwd;
    @Column(columnDefinition = "varchar(50) not null unique")
    private String mnickname;
    @Column(columnDefinition = "varchar(50) not null unique")
    private String memail;
    @Column(columnDefinition = "enum('USER', 'OWNER', 'ADMIN') not null")
    private String mrole;
    @Column(columnDefinition = "varchar(100)")
    private String maddress1;
    @Column(columnDefinition = "varchar(100)")
    private String maddress2;

    public MemberDto toDto(){
        return MemberDto.builder()
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